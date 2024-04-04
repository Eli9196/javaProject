package com.tbp.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tbp.crud.entity.AccountProfile;
import com.tbp.crud.service.AccountProfileService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
  
 @RestController
public class UserController {
	@Autowired
	private AccountProfileService userService;

	@PostMapping("/addUser")
	public AccountProfile addUser(@RequestBody AccountProfile user) {
		return userService.createUser(user);
	}

	@PostMapping("/addUsers")
	public List<AccountProfile> addUsers(@RequestBody List<AccountProfile> users) {
		return userService.createUsers(users);
	}

	@GetMapping("/user/{id}")
	public AccountProfile getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@GetMapping("/users")
	public List<AccountProfile> getAllUsers() {
		return userService.getUsers();
	}
	
	@PutMapping("/updateuser")
	public AccountProfile updateUser(@RequestBody AccountProfile user) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUserById(id);
	}
}

//package com.tbp.crud.service;
package com.tbp.crud.controller;

// Import statements and class definition


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tbp.crud.dao.AccountProfileRepository;
import com.tbp.crud.entity.AccountProfile;

@Service
public class AccountProfileService {
	@Autowired
	private AccountProfileRepository userRepository;

	public AccountProfile createUser(com.tbp.crud.controller.AccountProfile user) {
		return userRepository.save(user);
	}

	@SuppressWarnings("null")
	public List<AccountProfile> createUsers(List<AccountProfile> users) {
		return userRepository.saveAll(users);
	}

	public AccountProfile getUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}

	public List<AccountProfile> getUsers() {
		return userRepository.findAll();
	}
	
	public AccountProfile updateUser(AccountProfile user) {
		AccountProfile oldUser=null;
		Optional<AccountProfile> optionaluser=userRepository.findById(user.getId());
		if(optionaluser.isPresent()) {
			oldUser=optionaluser.get();
			oldUser.setName(user.getName());
			oldUser.setSurname(user.getSurname());
			oldUser.setHttpImageLink(user.getHttpImageLink());
			userRepository.save(oldUser);
		}else {
			return new AccountProfile();
		}
		return oldUser;
	}
	
	public String deleteUserById(int id) {
		userRepository.deleteById(id);
		return "User got deleted";
	}

}

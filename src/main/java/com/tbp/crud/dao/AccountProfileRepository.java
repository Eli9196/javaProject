package com.tbp.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbp.crud.entity.AccountProfile;

public interface AccountProfileRepository extends JpaRepository<AccountProfile, Integer> {

    AccountProfile save(com.tbp.crud.controller.AccountProfile user);

}

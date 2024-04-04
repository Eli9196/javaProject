//package com.tbp.crud.controller;
package com.tbp.crud.controller;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.tbp.crud.entity.AccountProfile;

import com.tbp.crud.entity.AccountProfile;

@SuppressWarnings("unused")
public interface AccountProfileRepository extends JpaRepository<AccountProfile, Integer> {

}

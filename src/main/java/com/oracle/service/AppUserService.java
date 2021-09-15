package com.oracle.service;


import java.util.List;


import com.oracle.domain.AppUser;

public interface AppUserService {

	List<AppUser> findAllUsers();

	void saveUser(AppUser appUser);

	List<AppUser> findAllAppUsers();

}

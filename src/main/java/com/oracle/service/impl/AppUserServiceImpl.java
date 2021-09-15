package com.oracle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.domain.AppUser;
import com.oracle.repository.AppUserRepository;
import com.oracle.service.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService {

	@Autowired
	private AppUserRepository appUserRepository;
	
	@Override
	public List<AppUser> findAllUsers() {
		return appUserRepository.findAll();
	}

	@Override
	public void saveUser(AppUser appUser) {
		appUserRepository.save(appUser);
		
	}

	@Override
	public List<AppUser> findAllAppUsers() {
		return appUserRepository.findAllAppUsers();
	}


}

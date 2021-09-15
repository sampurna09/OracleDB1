package com.oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.domain.AppUser;
import com.oracle.service.AppUserService;



@RestController
public class HomeController {
	
	@Autowired
	private AppUserService appUserService;
	
	@RequestMapping("/getUsers")
	public ResponseEntity<List<AppUser>> getUsers() {
		 return ResponseEntity.ok().body(appUserService.findAllUsers());
	}
	
	@RequestMapping("/getUsersQuery")
	public ResponseEntity<List<AppUser>> getUsersQuery() {
		 return ResponseEntity.ok().body(appUserService.findAllAppUsers());
	}

}

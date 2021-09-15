package com.oracle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oracle.domain.AppUser;
import com.oracle.service.AppUserService;

@SpringBootApplication
public class OracleDbApplication implements CommandLineRunner {

	@Autowired
	private AppUserService appUserService;
	
	public static void main(String[] args) {
		SpringApplication.run(OracleDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AppUser appUser1= new AppUser();
		appUser1.setId((long) 1);
		appUser1.setEmail("myemail");
		appUser1.setName("myName");
		appUserService.saveUser(appUser1);
		
	}

}

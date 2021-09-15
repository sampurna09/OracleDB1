package com.oracle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oracle.domain.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	
	@Query(value = "SELECT * FROM APP_USER u WHERE u.id=1", nativeQuery = true)
	List<AppUser> findAllAppUsers();

}

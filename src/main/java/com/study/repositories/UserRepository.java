package com.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.study.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

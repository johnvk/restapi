package com.jmallavalli.springboot.restapi.jpa;

import com.jmallavalli.springboot.restapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

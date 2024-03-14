package com.coderscampus.springsecurity.repository;

import com.coderscampus.springsecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

   User findByUsername(String username);
}

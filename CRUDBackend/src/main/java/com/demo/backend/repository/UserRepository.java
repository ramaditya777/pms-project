package com.demo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.backend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}

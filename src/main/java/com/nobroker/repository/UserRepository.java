package com.nobroker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nobroker.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}

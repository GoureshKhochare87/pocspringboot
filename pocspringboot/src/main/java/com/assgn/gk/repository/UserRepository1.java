package com.assgn.gk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assgn.gk.model.User;

@Repository
public interface UserRepository1 extends JpaRepository<User, Long>{

}


package com.bridgelab.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelab.example.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	

}

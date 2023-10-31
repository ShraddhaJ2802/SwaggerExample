package com.bridgelab.example.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelab.example.dto.UserDTO;
import com.bridgelab.example.model.User;
import com.bridgelab.example.service.UserService;





@RestController

public class UserController {
	
	@Autowired
	private UserService userService;
	
	/*@PostMapping("/add")
	 public User addUser(@RequestBody User user)
	 {
		User userData = userService.addUser(user);
		return userData;
	 }*/
	
	@PostMapping("/add")
	 public User addUser(@Valid @RequestBody UserDTO user)
	 {
		User userData = userService.addUser(user);
		return userData;
	 }
	
	@GetMapping("/getalll")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("/get/{id}")
	public User getUserById(@PathVariable int id)
	{
		return userService.getByUserId(id);
	}
	
	/*@PutMapping("/update/{id}")
	public User updateUser(@PathVariable int id , @RequestBody User user )
	{
		return userService.updateUser(id,user);
	}*/
	
	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable int id , @RequestBody UserDTO user )
	{
		return userService.updateUser(id,user);
	}
	@DeleteMapping("/delete/{id}")
	public void DeleteUser(@PathVariable int id  )
	{
		 userService.DeleteUser(id);
	}
	
}

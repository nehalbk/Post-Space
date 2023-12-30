package com.postspace.api.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepo repo;

	@GetMapping(value="/users")
	public  List<User> getAllUsers(){
		return repo.findAll();
	}
	
	@GetMapping(value="/users/{userid}")
	public  User getUser(@PathVariable Integer userid){
		return repo.findById(userid).orElse(new User(0,"not found","not found"));
	}
	
	@PostMapping(value="/users")
	public void saveUser(@RequestBody User user) {
		repo.save(user);
	}
}

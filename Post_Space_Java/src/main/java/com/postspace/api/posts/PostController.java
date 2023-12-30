package com.postspace.api.posts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@Autowired
	PostRepo repo;

	@GetMapping(value="/posts")
	public  List<Post> getAllPosts(){
		return repo.findAll();
	}
	
	@GetMapping(value="/posts/{postid}")
	public  Post getUser(@PathVariable Integer postid){
		return repo.findById(postid).orElse(null);
	}
	
	@PostMapping(value="/users/{userid}/posts")
	public void saveUser(@RequestBody Post post) {
		repo.save(post);
	}
	
	@GetMapping(value="/users/{userid}/posts")
	public List<Post> getPosts(@PathVariable Integer userid) {
		return repo.findByUserid(userid);
	}
}

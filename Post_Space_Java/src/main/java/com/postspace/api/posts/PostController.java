package com.postspace.api.posts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(value="**/posts/{postid}")
	public  Post getPost(@PathVariable Integer postid){
		return repo.findById(postid).orElse(null);
	}
	
	@PostMapping(value="/users/{userid}/posts")
	public void newPost(@RequestBody Post post) {
		repo.save(post);
	}
	
	@DeleteMapping(value="/users/{userid}/posts")
	public void deletePost(@RequestBody Post post) {
		repo.delete(post);
	}
	
	@PutMapping(value="/users/{userid}/posts")
	public void editPost(@RequestBody Post post) {
		repo.save(post);
	}
	
	@GetMapping(value="/users/{userid}/posts")
	public List<Post> getPosts(@PathVariable Integer userid) {
		return repo.findByUserid(userid);
	}
}

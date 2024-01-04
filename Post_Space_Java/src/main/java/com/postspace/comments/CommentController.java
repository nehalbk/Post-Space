package com.postspace.comments;

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
public class CommentController {
	
	@Autowired
	CommentRepo repo;

	@GetMapping(value="/comments")
	public  List<Comment> getAllComments(){
		return repo.findAll();
	}
	
	@GetMapping(value="/comments/{commentid}")
	public  Comment getPost(@PathVariable Integer commentid){
		return repo.findById(commentid).orElse(null);
	}
	
	@PostMapping(value="/users/{userid}/posts/{postid}/comments")
	public void newPost(@RequestBody Comment comment) {
		repo.save(comment);
	}
	
	@DeleteMapping(value="/users/{userid}/posts/{postid}/comments")
	public void deletePost(@RequestBody Comment comment) {
		repo.delete(comment);
	}
	
	@PutMapping(value="/users/{userid}/posts/{postid}/comments")
	public void editPost(@RequestBody Comment comment) {
		repo.save(comment);
	}
	
	@GetMapping(value="/users/{userid}/posts/{postid}/comments")
	public List<Comment> getPosts(@PathVariable Integer postid) {
		return repo.findByPostid(postid);
	}
}

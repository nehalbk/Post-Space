package com.postspace.api.likes;

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
public class LikeController {
	
	@Autowired
	LikeRepo repo;

	@GetMapping(value="/likes")
	public  List<Like> getAllLikes(){
		return repo.findAll();
	}
	
	@GetMapping(value="/likes/{likeid}")
	public  Like getLike(@PathVariable Integer likeid){
		return repo.findById(likeid).orElse(null);
	}
	
	@PostMapping(value="/users/{userid}/posts/{postid}/likes")
	public void newLike(@RequestBody Like like) {
		repo.save(like);
	}
	
	@DeleteMapping(value="/users/{userid}/posts/{postid}/likes")
	public void deletePost(@RequestBody Like like) {
		repo.delete(like);
	}
	
	@GetMapping(value="/users/{userid}/posts/{postid}/likes")
	public List<Like> getPosts(@PathVariable Integer postid) {
		return repo.findByPostid(postid);
	}
}

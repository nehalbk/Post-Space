package com.postspace.api.posts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
public interface PostRepo extends JpaRepository<Post, Integer>{
	
	@Transactional
	@Modifying
	@Query("SELECT t FROM Post t WHERE t.postuserid=?1")
	List<Post> findByUserid(Integer userid);
	
}

package com.postspace.comments;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
public interface CommentRepo extends JpaRepository<Comment, Integer>{
	
	@Transactional
	@Modifying
	@Query("SELECT t FROM Comment t WHERE t.commentpostid=?1")
	List<Comment> findByPostid(Integer userid);
	
}

package com.postspace.api.likes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
public interface LikeRepo extends JpaRepository<Like, Integer>{
	
	@Transactional
	@Modifying
	@Query("SELECT t FROM Like t WHERE t.likepostid=?1")
	List<Like> findByPostid(Integer userid);
	
}

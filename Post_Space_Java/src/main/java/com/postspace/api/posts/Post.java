package com.postspace.api.posts;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer postid;
	private String postcont;
	private Integer postuserid;
	
	public Post() {}

	public Post(Integer postid, String postcont, Integer postuserid) {
		this.postid = postid;
		this.postcont = postcont;
		this.postuserid = postuserid;
	}

	public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public String getPostcont() {
		return postcont;
	}

	public void setPostcont(String postcont) {
		this.postcont = postcont;
	}

	public Integer getPostuserid() {
		return postuserid;
	}

	public void setPostuserid(Integer postuserid) {
		this.postuserid = postuserid;
	}

	@Override
	public String toString() {
		return "Post [postid=" + postid + ", postcont=" + postcont + ", postuserid=" + postuserid + "]";
	};

	
}

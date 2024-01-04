package com.postspace.api.likes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="likes")
public class Like {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer likeid;
	private Integer likeuserid;
	private Integer likepostid;
	
	public Like() {}
	
	

	public Like(Integer likeid, Integer likeuserid, Integer likepostid) {
		super();
		this.likeid = likeid;
		this.likeuserid = likeuserid;
		this.likepostid = likepostid;
	}



	public Integer getLikeid() {
		return likeid;
	}

	public void setLikeid(Integer likeid) {
		this.likeid = likeid;
	}

	public Integer getLikeuserid() {
		return likeuserid;
	}

	public void setLikeuserid(Integer likeuserid) {
		this.likeuserid = likeuserid;
	}

	public Integer getLikepostid() {
		return likepostid;
	}

	public void setLikepostid(Integer likepostid) {
		this.likepostid = likepostid;
	}

	@Override
	public String toString() {
		return "Like [likeid=" + likeid + ", likeuserid=" + likeuserid + ", likepostid=" + likepostid + "]";
	}

	
	
}

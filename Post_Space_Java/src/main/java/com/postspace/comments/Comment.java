package com.postspace.comments;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer commentid;
	private String commentcont;
	private Integer commentuserid;
	private Integer commentpostid;
	
	public Comment() {}

	public Comment(Integer commentid, String commentcont, Integer commentuserid, Integer commentpostid) {
		super();
		this.commentid = commentid;
		this.commentcont = commentcont;
		this.commentuserid = commentuserid;
		this.commentpostid = commentpostid;
	}

	public Integer getCommentid() {
		return commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	public String getCommentcont() {
		return commentcont;
	}

	public void setCommentcont(String commentcont) {
		this.commentcont = commentcont;
	}

	public Integer getCommentuserid() {
		return commentuserid;
	}

	public void setCommentuserid(Integer commentuserid) {
		this.commentuserid = commentuserid;
	}

	public Integer getCommentpostid() {
		return commentpostid;
	}

	public void setCommentpostid(Integer commentpostid) {
		this.commentpostid = commentpostid;
	}

	@Override
	public String toString() {
		return "Comment [commentid=" + commentid + ", commentcont=" + commentcont + ", commentuserid=" + commentuserid
				+ ", commentpostid=" + commentpostid + "]";
	}

		
}

package com.lmproject.application.database.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the user_relations database table.
 * 
 */
@Entity
@Table(name="user_relations")
@NamedQuery(name="UserRelation.findAll", query="SELECT u FROM UserRelation u")
public class UserRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USER_RELATIONS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_RELATIONS_ID_GENERATOR")
	private Integer id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="deleted_at")
	private Timestamp deletedAt;

	@Column(name="relation_cd")
	private Integer relationCd;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="user_id1")
	private String userId1;

	@Column(name="user_id2")
	private String userId2;

	public UserRelation() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Timestamp deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Integer getRelationCd() {
		return this.relationCd;
	}

	public void setRelationCd(Integer relationCd) {
		this.relationCd = relationCd;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUserId1() {
		return this.userId1;
	}

	public void setUserId1(String userId1) {
		this.userId1 = userId1;
	}

	public String getUserId2() {
		return this.userId2;
	}

	public void setUserId2(String userId2) {
		this.userId2 = userId2;
	}

}
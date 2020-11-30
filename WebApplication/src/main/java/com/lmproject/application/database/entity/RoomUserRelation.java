package com.lmproject.application.database.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the room_user_relations database table.
 * 
 */
@Entity
@Table(name="room_user_relations")
@NamedQuery(name="RoomUserRelation.findAll", query="SELECT r FROM RoomUserRelation r")
public class RoomUserRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ROOM_USER_RELATIONS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROOM_USER_RELATIONS_ID_GENERATOR")
	private Integer id;

	@Column(name="authority_cd")
	private Integer authorityCd;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="deleted_at")
	private Timestamp deletedAt;

	@Column(name="room_id")
	private String roomId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="user_id")
	private String userId;

	public RoomUserRelation() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAuthorityCd() {
		return this.authorityCd;
	}

	public void setAuthorityCd(Integer authorityCd) {
		this.authorityCd = authorityCd;
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

	public String getRoomId() {
		return this.roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
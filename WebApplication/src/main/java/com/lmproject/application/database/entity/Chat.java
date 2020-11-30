package com.lmproject.application.database.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the chats database table.
 *
 */
@Entity
@Table(name="chats")
@NamedQuery(name="Chat.findAll", query="SELECT c FROM Chat c")
public class Chat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CHATS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CHATS_ID_GENERATOR")
	private Integer id;

	@Column(name="bote_date")
	private Timestamp boteDate;

	@Column(name="chat_text")
	private String chatText;

	private String contributer;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="deleted_at")
	private Timestamp deletedAt;

	@Column(name="room_id")
	private String roomId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	public Chat() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getBoteDate() {
		return this.boteDate;
	}

	public void setBoteDate(Timestamp boteDate) {
		this.boteDate = boteDate;
	}

	public String getChatText() {
		return this.chatText;
	}

	public void setChatText(String chatText) {
		this.chatText = chatText;
	}

	public String getContributer() {
		return this.contributer;
	}

	public void setContributer(String contributer) {
		this.contributer = contributer;
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

}
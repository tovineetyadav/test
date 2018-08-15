package com.infy.defecttracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="defect")
public class Defect {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",nullable=false)
	private long id;
	
	@Column(name="category",nullable=false)
	private String category;
	
	@Column(name="chgstatus")
	private String chgstatus;
	
	@Column(name="description",nullable=false)
	private String description;
	
	@Column(name="priority",nullable=false)
	private long priority;
	
	@Column(name="status",nullable=false)
	private String status;

	public Defect() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getChgstatus() {
		return chgstatus;
	}

	public void setChgstatus(String chgstatus) {
		this.chgstatus = chgstatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPriority() {
		return priority;
	}

	public void setPriority(long priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}

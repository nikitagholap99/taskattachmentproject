package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "taskattachment")
public class TaskAttachment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "task_attachment_id")
	private int task_attachment_id;

	@Column(name = "task_id")
	private String task_id;

	@Column(name = "attachment_path")
	private String attachment_path;

//	@Column(name = "created_at")
//	private Date created_at;
//
//	@Column(name = "created_by")
//	private String created_by;
//
//	@Column(name = "updated_at")
//	private Date updated_at;
//
//	@Column(name = "updated_by")
//	private String updated_by;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public int getTask_attachment_id() {
		return task_attachment_id;
	}

	public void setTask_attachment_id(int task_attachment_id) {
		this.task_attachment_id = task_attachment_id;
	}

	public String getTask_id() {
		return task_id;
	}

	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}

	public String getAttachment_path() {
		return attachment_path;
	}

	public void setAttachment_path(String attachment_path) {
		this.attachment_path = attachment_path;
	}
//
//	public Date getCreated_at() {
//		return created_at;
//	}
//
//	public void setCreated_at(Date created_at) {
//		this.created_at = created_at;
//	}
//
//	public String getCreated_by() {
//		return created_by;
//	}
//
//	public void setCreated_by(String created_by) {
//		this.created_by = created_by;
//	}
//
//	public Date getUpdated_at() {
//		return updated_at;
//	}
//
//	public void setUpdated_at(Date updated_at) {
//		this.updated_at = updated_at;
//	}
//
//	public String getUpdated_by() {
//		return updated_by;
//	}
//
//	public void setUpdated_by(String updated_by) {
//		this.updated_by = updated_by;
//	}

//	public void save(TaskAttachment taskattachment) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public List<TaskAttachment> findAll() {
//
//		return null;
//	}
//
//	public void setAllTaskattachmen(Object allTaskattachment) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public static Object getupdated_by() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static Object getupdated_at() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void setupdated_by(Object getupdated_by) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void setupdated_at(Object getupdated_at) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public static Object getcreated_by() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static Object getcreated_at() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void setcreated_by(Object getcreated_by) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void setcreated_at(Object getcreated_at) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void setTaskAttachment_path(String attachment_path2) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public static Object gettask_id() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void settask_id(Object gettask_id) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void settask_attachment_id(int task_attachment_id2) {
//		// TODO Auto-generated method stub
//
//	}
}

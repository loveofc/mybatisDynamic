package com.spring.mybatis;

import java.sql.Date;

public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String email;
	private Date joinDate;
	public MemberVO() {
		super();
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", joinDate="
				+ joinDate + "]";
	}
	public MemberVO(String id, String password, String name, String email, Date joinDate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.joinDate = joinDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
}

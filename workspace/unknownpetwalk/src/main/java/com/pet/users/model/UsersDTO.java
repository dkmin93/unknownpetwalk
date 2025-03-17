package com.pet.users.model;

import java.sql.Timestamp;

public class UsersDTO {
	
	private String id;
	private String pw;
	private String photo;
	private String nickname;
	private String address;
	private String phone;
	private String gender;
	private String introduction;
	private Timestamp regdate;
	
	
	public UsersDTO() {
	}


	public UsersDTO(String id, String pw, String photo, String nickname, String address, String phone, String gender,
			String introduction, Timestamp regdate) {
		super();
		this.id = id;
		this.pw = pw;
		this.photo = photo;
		this.nickname = nickname;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.introduction = introduction;
		this.regdate = regdate;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getIntroduction() {
		return introduction;
	}


	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}


	public Timestamp getRegdate() {
		return regdate;
	}


	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
	
	
}


package com.nobroker.payload;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
private long id;
private String name;
private String email;
private String mobile;
private String password;
public UserDto(long id, String name, String email, String mobile, String password) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.password = password;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public UserDto() {
	super();
	// TODO Auto-generated constructor stub
}


}

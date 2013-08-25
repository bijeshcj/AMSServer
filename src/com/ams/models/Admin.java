package com.ams.models;

public class Admin {
   private String adminName;
   private String password;
   public Admin(String admin,String password){
	   this.adminName = admin;
	   this.password = password;
   }
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
}

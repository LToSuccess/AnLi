package com.stx.demo1;
class User{
	private  String username;
	private String password;
	public User() {}
	public User(String username,String password) {
		this.username =username;
		this.password=password;
	}
	public  String  getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username=username;
	}
	public  String  getPassWord() {
		return password;
	}
	public void setPassWord(String password) {
		this.password=password;
	}
}
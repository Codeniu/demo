package cn.jbit.demo.entity;

public class UserInfo{

	private String username = null;//用户名
	private String password = null;//密码
	private String email = null;//电子邮箱
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

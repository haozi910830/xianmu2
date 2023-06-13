package entity;

public class User {
	private String userName;
	private String userPass;
	private String userEmail;
	public User(String userName, String userPass, String userEmail) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.userEmail = userEmail;
	}
	public User() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPass=" + userPass + ", userEmail=" + userEmail + "]";
	}


}

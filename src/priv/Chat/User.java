package priv.Chat;

import java.util.Date;

public class User {
	private int userID;			//用户编号
	private String userName;	//用户姓名
	private String password;	    //登录密码
	private Date joinTime;		//加入日期
	
	public void setuserID(int userID) {
		this.userID = userID;
	}
	
	public int getuserID() {
		return userID;
	}
	
	public void setuserName(String userName) {
		this.userName = userName;
	}
	
	public String getuserName() {
		return userName;
	}
	public void setpassword(String password) {
		this.password =  password;
	}
	public String  getpassword() {
		return password;
	}

	public void setjoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}
	
	public Date joinTime() {
		return joinTime;
	}
}
package priv.Chat;

import java.util.Date;

public class User {
	private int userID;			//�û����
	private String userName;	//�û�����
	private String password;	    //��¼����
	private Date joinTime;		//��������
	
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
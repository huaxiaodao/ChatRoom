package priv.Chat;

import java.util.Date;

public class Message {
	private int messageID;         //消息编号
	private int userID;			//用户编号
	private String userName;	//用户姓名
	private String messageContent;	    //消息内容
	private Date publishTime;		//发送时间
	
	public void setmessageID(int messageID) {
		this.messageID = messageID;
	}
	
	public int getmessageID() {
		return messageID;
	}
	
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
	public void setmessageContent(String messageContent) {
		this.messageContent =  messageContent;
	}

	public String  getmessageContent() {
		return messageContent;
	}

	public void setpublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	
	public Date getpublishTime() {
		return publishTime;
	}
}
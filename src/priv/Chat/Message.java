package priv.Chat;

import java.util.Date;

public class Message {
	private int messageID;         //��Ϣ���
	private int userID;			//�û����
	private String userName;	//�û�����
	private String messageContent;	    //��Ϣ����
	private Date publishTime;		//����ʱ��
	
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
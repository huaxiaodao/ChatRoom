package priv.Dao;

import java.util.List;

import priv.Chat.Message;

public interface MessageDao {
	public void addMessage(int userID,String userName,String messageContent);		//定义添加消息的方法
	public void updateMessage(Message message);	//定义修改消息的方法
	public void deleteMessage(int messageID);		//定义删除消息的方法
	public List<Message> findAllMessagee();		//定义按分页信息查询所有消息的方法
	public Message findMessageById(int messageID);	//定义按ID查询消息的方法
	public int findAllCount();					//定义查询消息记录数
}

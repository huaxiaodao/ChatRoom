package priv.Dao;

import java.util.List;

import priv.Chat.Message;

public interface MessageDao {
	public void addMessage(int userID,String userName,String messageContent);		//���������Ϣ�ķ���
	public void updateMessage(Message message);	//�����޸���Ϣ�ķ���
	public void deleteMessage(int messageID);		//����ɾ����Ϣ�ķ���
	public List<Message> findAllMessagee();		//���尴��ҳ��Ϣ��ѯ������Ϣ�ķ���
	public Message findMessageById(int messageID);	//���尴ID��ѯ��Ϣ�ķ���
	public int findAllCount();					//�����ѯ��Ϣ��¼��
}

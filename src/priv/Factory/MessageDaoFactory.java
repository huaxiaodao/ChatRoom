package priv.Factory;

import priv.Dao.MessageDao;
import priv.DaoImpl.MessageDaoImpl;


public class MessageDaoFactory {
	public static MessageDao getMessageDaoInstance(){	//������������������DAOʵ����ʵ��
		return new MessageDaoImpl();						//����DAOʵ����ʵ��
	}
}
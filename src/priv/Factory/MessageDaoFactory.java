package priv.Factory;

import priv.Dao.MessageDao;
import priv.DaoImpl.MessageDaoImpl;


public class MessageDaoFactory {
	public static MessageDao getMessageDaoInstance(){	//工厂方法，用来返回DAO实现类实例
		return new MessageDaoImpl();						//返回DAO实现类实例
	}
}
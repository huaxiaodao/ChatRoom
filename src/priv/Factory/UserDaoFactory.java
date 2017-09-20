package priv.Factory;

import priv.Dao.UserDao;
import priv.DaoImpl.UserDaoImpl;

public class UserDaoFactory {
	public static UserDao getUserDAOInstance(){	//工厂方法，用来返回DAO实现类实例
		return new UserDaoImpl();						//返回DAO实现类实例
	}
}

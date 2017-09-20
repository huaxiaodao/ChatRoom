package priv.Factory;

import priv.Dao.UserDao;
import priv.DaoImpl.UserDaoImpl;

public class UserDaoFactory {
	public static UserDao getUserDAOInstance(){	//������������������DAOʵ����ʵ��
		return new UserDaoImpl();						//����DAOʵ����ʵ��
	}
}

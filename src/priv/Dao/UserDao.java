package priv.Dao;

import java.util.List;

import priv.Chat.User;

public interface UserDao {
		public void addUser(String userName, String password);		//��������û���Ϣ�ķ���
		public void updateUser(User user);	//�����޸��û���Ϣ�ķ���
		public void deleteUser(int userID);		//����ɾ���û���Ϣ�ķ���
		public List<User> findAllEmployee();		//�����ѯ�����û���Ϣ�ķ���
		public User findUserById(String userName);//���尴ID��ѯ�û���Ϣ�ķ���
}

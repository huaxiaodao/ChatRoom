package priv.Dao;

import java.util.List;

import priv.Chat.User;

public interface UserDao {
		public void addUser(String userName, String password);		//定义添加用户信息的方法
		public void updateUser(User user);	//定义修改用户信息的方法
		public void deleteUser(int userID);		//定义删除用户信息的方法
		public List<User> findAllEmployee();		//定义查询所有用户信息的方法
		public User findUserById(String userName);//定义按ID查询用户信息的方法
}

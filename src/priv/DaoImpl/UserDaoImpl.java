package priv.DaoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import priv.Chat.User;
import priv.Dao.UserDao;
import priv.util.MysqlConnect;

public class UserDaoImpl implements UserDao{

	@Override
	public void addUser(String userName, String password) {
		// TODO Auto-generated method stub
		Connection conn = MysqlConnect.getConnection();	//获得连接对象
		String addSQL = "insert into tb_user (userName,password,joinTime) values(?,?,?)";
		PreparedStatement pstmt = null;					//声明预处理对象
		try {
			pstmt = conn.prepareStatement(addSQL);
			pstmt.setString(1,userName);   //设置员工姓名
			pstmt.setString(2,password);      //设置员工性别
			pstmt.setDate(3,new Date(System.currentTimeMillis()));       //设置出生日期
			pstmt.executeUpdate();								//执行更新
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			MysqlConnect.close(pstmt);							//关闭预处理对象
			MysqlConnect.close(conn);							//关闭连接对象
		}
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(String userName) {
		// TODO Auto-generated method stub
		Connection conn = MysqlConnect.getConnection();		//获得连接对象
		String findByIDSQL = "select * from tb_user where userName = ?";	//SQL语句
		PreparedStatement pstmt = null;	//声明预处理对象
		ResultSet rs = null;
		User user = null;
		try {
			pstmt = conn.prepareStatement(findByIDSQL);		//获得预处理对象并赋值
			pstmt.setString(1, userName);					//设置参数
			rs = pstmt.executeQuery();						//执行查询
			if(rs.next()) {
				user = new User();
				user.setuserID(rs.getInt(1));		//设置员工编号
				user.setuserName(rs.getString(2));	//设置员工姓名
				user.setpassword(rs.getString(3));	//设置员工性别
				user.setjoinTime(rs.getDate(4));	//设置出生日期
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			MysqlConnect.close(rs);								//关闭结果集对象
			MysqlConnect.close(pstmt);							//关闭预处理对象
			MysqlConnect.close(conn);							//关闭连接对象
		}
		return user;
	}

}

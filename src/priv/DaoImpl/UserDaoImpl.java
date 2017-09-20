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
		Connection conn = MysqlConnect.getConnection();	//������Ӷ���
		String addSQL = "insert into tb_user (userName,password,joinTime) values(?,?,?)";
		PreparedStatement pstmt = null;					//����Ԥ�������
		try {
			pstmt = conn.prepareStatement(addSQL);
			pstmt.setString(1,userName);   //����Ա������
			pstmt.setString(2,password);      //����Ա���Ա�
			pstmt.setDate(3,new Date(System.currentTimeMillis()));       //���ó�������
			pstmt.executeUpdate();								//ִ�и���
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			MysqlConnect.close(pstmt);							//�ر�Ԥ�������
			MysqlConnect.close(conn);							//�ر����Ӷ���
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
		Connection conn = MysqlConnect.getConnection();		//������Ӷ���
		String findByIDSQL = "select * from tb_user where userName = ?";	//SQL���
		PreparedStatement pstmt = null;	//����Ԥ�������
		ResultSet rs = null;
		User user = null;
		try {
			pstmt = conn.prepareStatement(findByIDSQL);		//���Ԥ������󲢸�ֵ
			pstmt.setString(1, userName);					//���ò���
			rs = pstmt.executeQuery();						//ִ�в�ѯ
			if(rs.next()) {
				user = new User();
				user.setuserID(rs.getInt(1));		//����Ա�����
				user.setuserName(rs.getString(2));	//����Ա������
				user.setpassword(rs.getString(3));	//����Ա���Ա�
				user.setjoinTime(rs.getDate(4));	//���ó�������
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			MysqlConnect.close(rs);								//�رս��������
			MysqlConnect.close(pstmt);							//�ر�Ԥ�������
			MysqlConnect.close(conn);							//�ر����Ӷ���
		}
		return user;
	}

}

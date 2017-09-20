package priv.DaoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;


import priv.Chat.Message;
import priv.Dao.MessageDao;
import priv.util.MysqlConnect;

public class MessageDaoImpl implements MessageDao{

	@Override
	public void addMessage(int userID,String userName,String messageContent) {
		// TODO Auto-generated method stub
		Connection conn = MysqlConnect.getConnection();	//������Ӷ���
		String addSQL = "insert into tb_message(userID,userName,messageContent,publishTime) values(?,?,?,?)";
		PreparedStatement pstmt = null;					//����Ԥ�������
		try {
			pstmt = conn.prepareStatement(addSQL);		//���Ԥ������󲢸�ֵ
			pstmt.setInt(1, userID);//���õڶ�������
			pstmt.setString(2, userName);			//���õ���������
			pstmt.setString(3, messageContent);	
			pstmt.setDate(4, new Date(System.currentTimeMillis()));
			pstmt.executeUpdate();								//ִ�и���
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			MysqlConnect.close(pstmt);							//�ر�Ԥ�������
			MysqlConnect.close(conn);							//�ر����Ӷ���
		}
	}


	@Override
	public void updateMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMessage(int messageID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Message> findAllMessagee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message findMessageById(int messageID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findAllCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}

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
		Connection conn = MysqlConnect.getConnection();	//获得连接对象
		String addSQL = "insert into tb_message(userID,userName,messageContent,publishTime) values(?,?,?,?)";
		PreparedStatement pstmt = null;					//声明预处理对象
		try {
			pstmt = conn.prepareStatement(addSQL);		//获得预处理对象并赋值
			pstmt.setInt(1, userID);//设置第二个参数
			pstmt.setString(2, userName);			//设置第三个参数
			pstmt.setString(3, messageContent);	
			pstmt.setDate(4, new Date(System.currentTimeMillis()));
			pstmt.executeUpdate();								//执行更新
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			MysqlConnect.close(pstmt);							//关闭预处理对象
			MysqlConnect.close(conn);							//关闭连接对象
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

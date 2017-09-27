package priv.util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import priv.util.MysqlConnect;

public class UploadFile {
	public void UploadFile(String userName, String newfileName,String fileName) {
		// TODO Auto-generated method stub
		Connection conn = MysqlConnect.getConnection();	
		String addSQL = "insert into tb_file (userName,path,realname) values(?,?,?)";
		PreparedStatement pstmt = null;					
		try {
			pstmt = conn.prepareStatement(addSQL);
			pstmt.setString(1,userName);   
			pstmt.setString(2,newfileName);      
			pstmt.setString(3,fileName);      
			pstmt.executeUpdate();								
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			MysqlConnect.close(pstmt);							
			MysqlConnect.close(conn);							
		}
	}


}

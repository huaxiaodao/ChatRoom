package priv.Servlet;

import priv.DaoImpl.MessageDaoImpl;
import priv.DaoImpl.UserDaoImpl;
import priv.Chat.User;
import priv.util.UploadFile;

import org.apache.log4j.Logger;  
import org.apache.log4j.PropertyConfigurator;

public class Test {
	public static void main(String[] args){
		Logger log = Logger.getLogger(Test.class);  
		int userID = 1;
		String userName = "penglei";
		//String strContent = "ŶҮ";
		//UserDaoImpl userdao = new UserDaoImpl();
		//User user = userdao.findUserById(userName);
		//log.info("用户名: "+ user.getuserName()+" 用户ID: "+user.getuserID());
		//System.out.println(user.getuserName());
		//System.out.println(user.getuserID());
		String path = "/home/wasadmin/log";
		String fileName = "test.log";
		UploadFile file = new UploadFile();
		file.UploadFile(userName, path, fileName);
		log.info("用户名: "+ userName +" 路径: "+ path + " 文件名: " + fileName);
		//MessageDaoImpl MessageDao =new MessageDaoImpl();
	    //MessageDao.addMessage(userID, userName, strContent);
	}
}

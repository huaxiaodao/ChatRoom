package priv.Servlet;

import priv.DaoImpl.MessageDaoImpl;
import priv.DaoImpl.UserDaoImpl;
import priv.Chat.User;

import org.apache.log4j.Logger;  
import org.apache.log4j.PropertyConfigurator;

public class Test {
	public static void main(String[] args){
		Logger log = Logger.getLogger(Test.class);  
		int userID = 1;
		String userName = "penglei";
		String strContent = "哦耶";
		UserDaoImpl userdao = new UserDaoImpl();
		User user = userdao.findUserById(userName);
		log.info("查询成功,用户名: "+ user.getuserName()+" 用户ID: "+user.getuserID());
		//System.out.println(user.getuserName());
		//System.out.println(user.getuserID());
		
		//MessageDaoImpl MessageDao =new MessageDaoImpl();
	    //MessageDao.addMessage(userID, userName, strContent);
	}

}

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
		String strContent = "ŶҮ";
		UserDaoImpl userdao = new UserDaoImpl();
		User user = userdao.findUserById(userName);
		log.info("��ѯ�ɹ�,�û���: "+ user.getuserName()+" �û�ID: "+user.getuserID());
		//System.out.println(user.getuserName());
		//System.out.println(user.getuserID());
		
		//MessageDaoImpl MessageDao =new MessageDaoImpl();
	    //MessageDao.addMessage(userID, userName, strContent);
	}

}

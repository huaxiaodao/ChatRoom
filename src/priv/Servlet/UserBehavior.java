package priv.Servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import priv.Servlet.HelloServlet;
import priv.DaoImpl.UserDaoImpl;
import priv.DaoImpl.MessageDaoImpl;
import priv.Chat.User;

public class UserBehavior {
	private static final long serialVersionUID = 2L;
    List<String> OnLineUserList = new ArrayList<String>(); 
    static List<String> strSendConentList=new ArrayList<String>();
    String strAction;
    String strName;
    String strPass;
    String strContent;
    HttpSession session; 
	//行为
		public boolean UserLogin(String strName,String strPass,HttpSession session){
			 UserDaoImpl userDao = new UserDaoImpl();
		     User user = userDao.findUserById(strName);
			 boolean blnR = false;
			 if (strName.equals(user.getuserName()))
		        if (strPass.equals(user.getpassword()))//��֤����
		        {
		            if (OnLineUserList.size() == 0)//�ж��û��Ƿ�Ϊ��
		            {
		            	OnLineUserList = new ArrayList<String>();//Ϊ����Ϊ�û�arrayList���³�ʼ��
		            }
		            OnLineUserList.add(strName);//�����û����û�arrayList�����������û���������ʾ
		            session.setAttribute("LOGINUSER",
		            		strName);//登录
		            blnR = true;
		        }
		        return blnR;
		}
		public boolean UserRegister(String strName,String strPass) {
			// TODO Auto-generated method stub
			UserDaoImpl userDao = new UserDaoImpl();
		    userDao.addUser(strName, strPass);
			return true;
		};
		//聊天列表
		public String AllChatList(){
			String result="";
	        if (strSendConentList.size() == 0)
	        {
	           result = "日前还没有找到聊天记录";
	        }
	        else
	        {
	        	Iterator<String> it=strSendConentList.iterator();
	        	while(it.hasNext()){
	        		result += it.next() + "</br>";
	        	}
	        }
	       result= result.replace("<:", "<img src='Face/");
	       result=result.replace(":>", ".gif '/>");
	       return result;
		}
		//获取在线人数
		public String GetOnlineUserList(HttpSession session){
	        String result="";
		        if (OnLineUserList.size()==0)
		        {
		        		result="暂时没有人在线";
		        }else{
		        Iterator<String> it=OnLineUserList.iterator();
	        	while(it.hasNext()){
	        		result += it.next() + "</br>";
	        	}
		        }
		        return result;
		}
		//������Ϣ
		public Boolean AddSendContent(String strContent,HttpSession session){
			    String userName=(String) session.getAttribute("LOGINUSER");
			    //String name = session.getAttribute("LOGINUSER").toString();
			    if(null==userName){
			    	return false;
			    }
			    UserDaoImpl userDao = new UserDaoImpl();
			    User user = userDao.findUserById(userName);
			    int userID = user.getuserID();
			    MessageDaoImpl MessageDao =new MessageDaoImpl();
			    MessageDao.addMessage(userID, userName, strContent);
		        String strSendConent = userName + " 于" + new java.util.Date(System.currentTimeMillis()) + " ˵: " + strContent;
		        if (strSendConentList.size() == 0)
		        {
		        	strSendConentList = new ArrayList<String>();
		        }
		        strSendConentList.add(strSendConent);
		        return true;
		}
		//�ǳ�
		public boolean Logout(HttpSession session){
			if(null==session.getAttribute("LOGINUSER")){
				return false;
			}
			String name = session.getAttribute("LOGINUSER").toString();
			session.removeAttribute("LOGINUSER");
			if(OnLineUserList.size()!=0){
			for(int i=0;i<OnLineUserList.size();i++) {  
	            if(name.equals(OnLineUserList.get(i))) {  
	            	OnLineUserList.remove(i);  
	            }  
	            return true;
	        }
			}
			return false;
		}

}

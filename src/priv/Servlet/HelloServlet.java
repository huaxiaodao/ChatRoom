package priv.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import priv.Servlet.UserBehavior;

public class HelloServlet extends HttpServlet{
    UserBehavior userBehavior = new UserBehavior();
	public void service(
			HttpServletRequest request,
			HttpServletResponse response) 	
	throws ServletException,IOException{
		//获取行为和用户名密码聊天内容
		  String strAction = request.getParameter("action");
	      String strName = request.getParameter("name");
	      String strPass = request.getParameter("pass");
	      String strContent = request.getParameter("content");
	      HttpSession session = 
					request.getSession(); 
	      response.setContentType("text/html; charset=utf-8"); 
          PrintWriter out = response.getWriter();  
          //根据行为处理
	      if("Login".equals(strAction)){
	    	  boolean res=userBehavior.UserLogin(strName,strPass,session);
	    	  out.println(res);
              out.close();
	      }else if("Register".equals(strAction)){
	    	  boolean res1=userBehavior.UserRegister(strName,strPass);
              out.println(res1);  
              out.close();
	      }else if("ChatList".equals(strAction)){
	    	  String result1=userBehavior.AllChatList();
              out.println(result1);  
              out.close();
	      }else if("OnLineList".equals(strAction)){
	    	  String result2=userBehavior.GetOnlineUserList(session);  
              out.println(result2);  
              out.close();
	      }else if("SendContent".equals(strAction)){
	    	  Boolean res2=userBehavior.AddSendContent(strContent,session);
	    	  String result="";
	    	  if(res2){
	    		  result="1";
	    	  }else{
	    		  result="2";
	    	  }
              out.println(result);  
              out.close();
	      }else if("Logout".equals(strAction)){
	    	  boolean res3=userBehavior.Logout(session);
	          out.println(res3);  
	          out.close();
	      }
		
	}
	
}







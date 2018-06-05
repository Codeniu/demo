package cn.jbit.demo.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jbit.demo.biz.UserInfoBiz;
import cn.jbit.demo.biz.impl.UserInfoBizImpl;
import cn.jbit.demo.entity.UserInfo;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		UserInfoBiz userInfoBiz=new UserInfoBizImpl();
		if ("login".equals(action)) {//登录
			String username = request.getParameter("username");
	    	String password = request.getParameter("password");	    	
	    	Map<String,String> contitions = new HashMap<String,String>();
	  		contitions.put("username", username);
	  		contitions.put("pwd", password);
	    	List <UserInfo>list = userInfoBiz.findUser(contitions);
	    	if(list == null || list.size() != 1){
	    		request.setAttribute("error", "用户名或密码错误！");
	  			request.getRequestDispatcher("index.jsp").forward(request,response);	
	    	}else{
	    		request.getSession().setAttribute("loginuser", username);
	    		response.sendRedirect("MsgServlet?action=list");
	    	}  
		}else if("regist".equals(action)){//注册
			String username = request.getParameter("username");
		  	String password = request.getParameter("password");
		  	String email = request.getParameter("email");		  	
		  	Map<String,String> conditions = new HashMap<String,String>();
		  	conditions.put("username", username);
		  	List <UserInfo>list = userInfoBiz.findUser(conditions);
		  	if(list.size() > 0){		  			
		  		request.setAttribute("error", "此用户名已被注册");		  		
		  		request.getRequestDispatcher("register.jsp").forward(request,response);
		  	}else{
		  		UserInfo uf = new UserInfo();
		  		uf.setUsername(username);
		  		uf.setPassword(password);
		  		uf.setEmail(email);
		  		int isRun = userInfoBiz.doInsertOrUpdateUser("insert", uf);
		  		if(isRun > 0){
		  			request.setAttribute("error", "已经成功注册！");
		  			request.getRequestDispatcher("index.jsp").forward(request,response);		  			
		  		}
		  	}
		}else if("logout".equals(action)){//退出
			request.getSession().removeAttribute("loginuser");
			response.sendRedirect("index.jsp");
		}else if("findUsers".equals(action)){//查找其它所有的用户			
		 	String username = (String)request.getSession().getAttribute("loginuser");  	
		 	Map <String,String>contitions = new HashMap<String,String>();
		 	contitions.put("username", username);
		 	contitions.put("operate","except");
		 	List<UserInfo> list = userInfoBiz.findUser(contitions);
		 	request.setAttribute("users", list);
		 	request.getRequestDispatcher("newMsg.jsp").forward(request,response);
		}
	}
}

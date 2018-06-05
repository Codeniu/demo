package cn.jbit.demo.web;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jbit.demo.biz.BBSMessageBiz;
import cn.jbit.demo.biz.impl.BBSMessageBizImpl;
import cn.jbit.demo.entity.BBSMessage;

public class MsgServlet extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BBSMessageBiz bmb=new BBSMessageBizImpl();
		String action = request.getParameter("action");
		if(action.equals("del")){//删除短信息
			String msgid = request.getParameter("msgid");
	 		Map<String,Object> conditions = new HashMap<String,Object>();
	 		conditions.put("msgid", msgid); 
	 		int isSuccess = bmb.doInsertOrUpdateMsg("delete",new HashMap<String,Object>(),conditions);
	 		if(isSuccess > 0){
	 			request.setAttribute("error", "删除成功！");
	 			request.getRequestDispatcher("MsgServlet?action=list").forward(request,response);
	 		}else{	 			
	 			request.setAttribute("error", "删除属于非法操作，请确认当前用户权限！");
	 			request.getRequestDispatcher("MsgServlet?action=list").forward(request,response);
	 		}
		}else if(action.equals("send")){//发送短信息
			Random r = new Random();						
			String msgid = String.valueOf(r.nextInt());		
		  	String fromUser = (String)request.getSession().getAttribute("loginuser");
		  	String toUser = request.getParameter("toUser");
		  	String title = request.getParameter("title");
		  	String content = request.getParameter("content");
		  	String state = "0";
		  	Timestamp ts = new Timestamp((new Date()).getTime());	
		  	Map <String,Object>map = new HashMap<String,Object>();			
			map.put("msgid", msgid);
			map.put("sendto", toUser);
			map.put("title", title);
			map.put("msgcontent",content);
			map.put("state", state);
			map.put("username", fromUser);
			map.put("msg_create_date", ts);			
			bmb.doInsertOrUpdateMsg("insert",map,null);
			response.sendRedirect("MsgServlet?action=list");
		}else if(action.equals("list")){//显示当前用户的收件箱
			String username = (String)request.getSession().getAttribute("loginuser");	
			Map <String,Object>map = new HashMap<String,Object>();  	
			map.put("sendto", username);				
			List<BBSMessage> list = bmb.findMessages(map);
			request.setAttribute("msgs", list);	 
		    request.getRequestDispatcher("main.jsp").forward(request,response);
		}else if(action.equals("read")){//读取某条短信息
			Map <String,Object>elements = null;
		  	Map<String,Object> conditions = null;
		  	String msgid = request.getParameter("msgid");
		  	String state = request.getParameter("state");		  	
		  	if(state.equals("0")){
		  		elements = new HashMap<String,Object>();
		  		conditions = new HashMap<String,Object>();
		  		elements.put("state", "1");  		
		  		conditions.put("msgid", msgid);
		  		bmb.doInsertOrUpdateMsg("update", elements, conditions);
		  	}
		  	if(conditions == null){
				conditions = new HashMap<String,Object> ();
				conditions.put("msgid", msgid);
			}
		  	List<BBSMessage> list = bmb.findMessages(conditions);
		  	request.setAttribute("msg", list);
		  	request.getRequestDispatcher("readMsg.jsp").forward(request,response);
		}		
	}
}

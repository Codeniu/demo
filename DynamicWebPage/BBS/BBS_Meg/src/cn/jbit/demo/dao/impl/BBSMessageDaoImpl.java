package cn.jbit.demo.dao.impl;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.jbit.demo.dao.BBSMessageDao;
import cn.jbit.demo.dao.BaseDao;
import cn.jbit.demo.entity.BBSMessage;

public class BBSMessageDaoImpl extends BaseDao implements BBSMessageDao {
	/*
	 * 执行update操作
	 * @param
	 * 	operate：执行插入、更新还是删除
	 * 	elements：需要插入或者更新的值集合，key对应column，value是插入或者更新的值
	 * 	conditions：update执行的条件集合，key对应column，value是条件值
	 */
	public int executeUpdate(String operate, Map <String,Object>elements, Map <String,Object>conditions) {
		List<Object> list = null;
		String sql = null;
		String msgid= null ,username= null,title= null,msgcontent= null,state= null,sendto= null;
		Date msg_create_date=null;
		/*
		 * 获取需要变更的值
		 */
		if(elements!=null && elements.size()>0){
			msgid = (String)elements.get("msgid");
			username = (String)elements.get("username");
			title = (String)elements.get("title");
			msgcontent = (String)elements.get("msgcontent");
			state = (String)elements.get("state");
			sendto = (String)elements.get("sendto");
			msg_create_date = (Date)elements.get("msg_create_date");		
		}
		
		
		
		/*
		 * 更新操作
		 */
		if(operate.equals("update")){
			/*
			 * 拼写更新sql
			 */
			sql = "update msg set ";
			/*
			 * 获取条件元素
			 */
			String ctn_msgid = (String)conditions.get("msgid");
			String ctn_username = (String)conditions.get("username");
			String ctn_title = (String)conditions.get("title");
			String ctn_msgcontent = (String)conditions.get("msgcontent");
			String ctn_state = (String)conditions.get("state");
			String ctn_sendto = (String)conditions.get("sendto");
			Date ctn_msg_create_date = (Date)conditions.get("msg_create_date");
			/*
			 * 写出sql更新语句
			 */
			String and = "";
			sql += msgid!=null ? and + " msgid=? ":"";
			and = msgid!=null ? " and ":"";
			sql += username!=null ? and + " username=? ":"";
			and = username!=null ? " and ":"";
			sql += title!=null ? and + " title='" + title + "' ":"";
			and = title!=null ? " and ":"";
			sql += msgcontent!=null ? and + " msgcontent=? ":"";
			and = msgcontent!=null ? " and ":"";
			sql += sendto!=null ? and + " sendto=? ":"";
			and = sendto!=null ? " and ":"";
			sql += state!=null ? and + " state=? ":"";
			and = state!=null ? " and ":"";
			sql += msg_create_date != null ? and + " msg_create_date=? ":"";
			/*
			 * 写出sql条件语句
			 */	
			sql = sql + " where 1=1 ";
			sql += ctn_msgid != null ? " and msgid=? ":"";
			sql += ctn_username != null ? " and username=? ":"";
			sql += ctn_title != null ? " and title='" + title + "' ":"";
			sql += ctn_msgcontent != null ? " and msgcontent=? ":"";
			sql += ctn_sendto != null ? " and sendto=? ":"";
			sql += ctn_state != null ? " and state=? ":"";
			sql += ctn_msg_create_date != null ? " and msg_create_date=? ":"";
			
			list = new ArrayList<Object>();
			/*
			 * 设置更新参数
			 */
			if(msgid != null)
				list.add(msgid);
			if(username != null)
				list.add(username);
			if(title != null)
				list.add(title);
			if(msgcontent != null)
				list.add(msgcontent);
			if(sendto != null)
				list.add(sendto);
			if(state != null)
				list.add(state);
			if(msg_create_date != null)
				list.add(new Timestamp(msg_create_date.getTime()));
			/*
			 * 设置条件参数
			 */
			if(ctn_msgid != null)
				list.add(ctn_msgid);
			if(ctn_username != null)
				list.add(ctn_username);
			if(ctn_title != null)
				list.add(ctn_title);
			if(ctn_msgcontent != null)
				list.add(ctn_msgcontent);
			if(ctn_sendto != null)
				list.add(ctn_sendto);
			if(ctn_state != null)
				list.add(ctn_state);
			if(ctn_msg_create_date != null)
				list.add(new Timestamp(ctn_msg_create_date.getTime()));
		}
		/*
		 * 添加操作
		 */
		else if(operate.equals("insert")){
			//任务3
			sql = "insert into msg values(?,?,?,?,?,?,?)";
            list = new ArrayList<Object>();
            list.add(msgid);
            list.add(username);
            list.add(title);
            list.add(msgcontent);
            list.add(state);
            list.add(sendto);
            list.add(new Timestamp(msg_create_date.getTime()));
		}
		/*
		 * 删除操作
		 */
		else if(operate.equals("delete")){
			/*
			 * 任务4：实现删除消息
			 * */
			sql = "delete from msg where msgid = ?";
            list = new ArrayList<Object>();
            msgid = (String)conditions.get("msgid");
            list.add(msgid);
			
		}
		return executeUpdata(sql, list);
	}
	/*
	 * 执行查询操作
	 * @param
	 * 	elements：查询条件集合 	
	 */	
	public List<BBSMessage> getMessagesByPage(Map<String,Object> elements) {		
		/*
		 * 获取查询语句中的条件参数，给一例msds_in_one_page
		 */		
		Integer msgs_in_one_page = (Integer)elements.get("msgs_in_one_page");
		Integer page_no = (Integer)elements.get("page_no");
		String username = (String)elements.get("username");
		String msgid = (String)elements.get("msgid");
		String title = (String)elements.get("title");
		String msgcontent = (String)elements.get("msgcontent");
		String sendto = (String)elements.get("sendto");
		Integer state = (Integer)elements.get("state");
		Date msg_create_date = (Date)elements.get("msg_create_date");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");		
		/*
		 * 拼写sql
		 */
		String sql = "select * from msg where 1 = 1 ";		
		/*
		 * 编写条件语句
		 */		
		sql += msgid!=null ? " and msgid='" + msgid + "' ":"";
		sql += username != null?" and username='" + username + "' ":"";
		sql += title!=null ? " and title='" + title + "' ":"";
		sql += msgcontent!=null ? " and msgcontent='" + msgcontent + "' ":"";
		sql += sendto!=null ? " and sendto='" + sendto + "' ":"";
		sql += state!=null ? " and state=" + state + " ":"";
		sql += msg_create_date!=null ? " and msg_create_date='" + sdf.format(msg_create_date) + "' ":"";	
		
		if(page_no != null){
		    sql += " LIMIT " + msgs_in_one_page*(page_no - 1)
	                + ", " + msgs_in_one_page;
		}
		/*
		 * 返回结果
		 */
		//任务5
		  List <BBSMessage>list = null;        
	        openConnection();
	        list = new ArrayList<BBSMessage>();
	        try {
	            ps = con.prepareStatement(sql);
	            rs = ps.executeQuery();
	            while(rs.next()){
	                BBSMessage bms = new BBSMessage();
	                bms.setMsgid(rs.getString("msgid"));
	                bms.setTitle(rs.getString("title"));
	                bms.setContent(rs.getString("msgcontent"));
	                bms.setSendto(rs.getString("sendto"));
	                bms.setState(rs.getInt("state"));
	                bms.setDatetime(rs.getDate("msg_create_date"));
	                bms.setUsername(rs.getString("username"));
	                list.add(bms);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }finally{
	            closeResource();
	        }
	        return list;
	}

	public int getMsgsCount(String username) {		
		String always_true = " where 1=1 ";
		int count = 0;
		if(username == null){
			username = "";
		}else{
			username = " and username = '" + username + "'";
		}	
		String sql = "select count(*) from msg " + always_true + username;
		
		openConnection();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
				count = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

}

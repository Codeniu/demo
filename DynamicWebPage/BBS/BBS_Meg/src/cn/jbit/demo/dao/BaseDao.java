package cn.jbit.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BaseDao {

	protected Connection con = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	//获取连接
	protected void openConnection(){
			try {
				Context ctx = new InitialContext();
				DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/Message");
				con = ds.getConnection();
			} catch (NamingException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}	
	
	//更新新据库
	public int executeUpdata(String sql, List<Object> list){		
		openConnection();
		try {
			ps = con.prepareStatement(sql);
			if(list == null)
				return ps.executeUpdate();
			int i = 1;
			for(Object obj:list){
				ps.setObject(i, obj);
				i++;
			}
			return ps.executeUpdate();
		} catch (SQLException e) {			
			e.printStackTrace();
		}finally{
			closeResource();
		}
		return 0;
	}
	
	//关闭流
	protected void closeResource(){		
	try {
		if(rs != null)
			rs.close();
		if(ps != null)
			ps.close();
		if(con != null)
			con.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

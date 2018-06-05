package cn.jbit.demo.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import cn.jbit.demo.dao.BaseDao;
import cn.jbit.demo.dao.UserinfoDao;
import cn.jbit.demo.entity.UserInfo;

public class UserinfoDaoImpl extends BaseDao implements UserinfoDao {
	
	//任务一：添加或更新用户
	public int executeUpdate(String operate, UserInfo userinfo) {
		List<Object> list = null;
        String sql = null;
        if(operate.equals("update")){
            sql = "update msg_userinfo set password=? where username = '" + userinfo.getUsername() + "'";
            list = new ArrayList<Object>();
            list.add(userinfo.getPassword());
        }else if(operate.equals("insert")){
            sql = "insert into msg_userinfo values(?,?,?)";
            list = new ArrayList<Object>();
            list.add(userinfo.getUsername());
            list.add(userinfo.getPassword());
            list.add(userinfo.getEmail());
        }
        return executeUpdata(sql, list);
	}

	//任务二：查找用户
	public List<UserInfo> getUsers(Map<String,String> contitions) {
		
		String username = (String) contitions.get("username");
        String pwd = (String) contitions.get("pwd");
        String operate = (String)contitions.get("operate");
        String sql = "select * from msg_userinfo where 1=1 ";
        	
        if(operate != null && operate.equals("except")){
            sql += username != null ? " and username != '" + username + "'":"";
        }else{
            sql += username != null ? " and username = '" + username + "'":"";
        }
        sql += pwd != null ? " and password = '" + pwd + "'":"";
        openConnection();
        List<UserInfo> users = new ArrayList<UserInfo>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                UserInfo uf = new UserInfo();
                uf.setUsername(rs.getString("username"));
                uf.setPassword(rs.getString("password"));
                uf.setEmail(rs.getString("email"));
                users.add(uf);                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            closeResource();
        }        
        return users;
    }

}


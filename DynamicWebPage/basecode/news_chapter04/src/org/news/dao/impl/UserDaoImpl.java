package org.news.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.news.dao.BaseDao;
import org.news.dao.UserDao;
import org.news.entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {

    public User findUser(String uname, String password) {
    	getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		String sql = "select * from news_users where uname = ? and upwd = ? ";
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, uname);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()){
				user = new User(rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			closeAll(conn, pstmt, rs);
		return user;
    }
}

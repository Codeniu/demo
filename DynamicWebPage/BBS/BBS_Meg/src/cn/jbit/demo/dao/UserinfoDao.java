package cn.jbit.demo.dao;

import java.util.List;
import java.util.Map;

import cn.jbit.demo.entity.UserInfo;

public interface UserinfoDao {
	//查找用户
	public List<UserInfo> getUsers(Map<String,String> contitions);
	//添加或更新用户
	public int executeUpdate(String operate, UserInfo userinfo);
}

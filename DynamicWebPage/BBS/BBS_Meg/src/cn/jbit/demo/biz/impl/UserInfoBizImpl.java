package cn.jbit.demo.biz.impl;

import java.util.List;
import java.util.Map;

import cn.jbit.demo.biz.UserInfoBiz;
import cn.jbit.demo.dao.UserinfoDao;
import cn.jbit.demo.dao.impl.UserinfoDaoImpl;
import cn.jbit.demo.entity.UserInfo;

public class UserInfoBizImpl implements UserInfoBiz {

	private UserinfoDao userinfoDao = new UserinfoDaoImpl();

	//添加或更新用户
	public int doInsertOrUpdateUser(String operate, UserInfo userinfo) {
		
		return userinfoDao.executeUpdate(operate, userinfo);
	}

	//查找用户
	public List<UserInfo> findUser(Map<String,String> elements) {
		
		return userinfoDao.getUsers(elements);
	}
}

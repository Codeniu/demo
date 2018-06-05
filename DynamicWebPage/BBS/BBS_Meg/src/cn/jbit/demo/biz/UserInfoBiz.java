package cn.jbit.demo.biz;

import java.util.List;
import java.util.Map;

import cn.jbit.demo.entity.UserInfo;

public interface UserInfoBiz {
	//查找用户
	public List<UserInfo> findUser(Map<String,String> elements);
	//添加或更新用户
	public int doInsertOrUpdateUser(String operate, UserInfo userinfo);
}

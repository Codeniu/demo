package cn.jbit.demo.dao;

import java.util.List;
import java.util.Map;

import cn.jbit.demo.entity.BBSMessage;

public interface BBSMessageDao {
	//查询短信息
	public List<BBSMessage>  getMessagesByPage(Map<String,Object> elements);
	//更新短信息
	public int executeUpdate(String operate, Map<String,Object> elements, Map<String,Object> conditions);
	//获取短信条数
	public int getMsgsCount(String username);
}

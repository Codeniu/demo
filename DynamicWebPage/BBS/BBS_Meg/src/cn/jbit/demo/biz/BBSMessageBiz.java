package cn.jbit.demo.biz;

import java.util.List;
import java.util.Map;

import cn.jbit.demo.entity.BBSMessage;

public interface BBSMessageBiz {	
	//查询短信息
	public List<BBSMessage> findMessages(Map<String,Object> elements);
	//更新或删除短信息
	public int doInsertOrUpdateMsg(String operate, Map<String,Object> elements, Map<String,Object> conditions);
}

package cn.jbit.demo.biz.impl;
import java.util.List;
import java.util.Map;

import cn.jbit.demo.biz.BBSMessageBiz;
import cn.jbit.demo.dao.BBSMessageDao;
import cn.jbit.demo.dao.impl.BBSMessageDaoImpl;
import cn.jbit.demo.entity.BBSMessage;

public class BBSMessageBizImpl implements BBSMessageBiz {
	private BBSMessageDao bmd = new BBSMessageDaoImpl();
	//更新或删除短信息
	public int doInsertOrUpdateMsg(String operate, Map<String,Object> elements, Map<String,Object> conditions) {		
		return bmd.executeUpdate(operate, elements, conditions);
	}
	//查询短信息
	public List<BBSMessage> findMessages(Map<String,Object> elements) {
		return bmd.getMessagesByPage(elements);
	}	
}

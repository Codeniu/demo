package org.news.test;

import java.util.ArrayList;
import java.util.List;
import org.news.dao.NewsDao;
import org.news.dao.UserDao;
import org.news.dao.impl.NewsDaoImpl;
import org.news.dao.impl.UserDaoImpl;
import org.news.entity.News;
import org.news.entity.User;

import org.junit.Test;

public class test {
	
    UserDao userDao=new UserDaoImpl(); 
    NewsDao newsDao = new NewsDaoImpl();
    
	@Test
	public void testgetAllnewsByTID() {
		
		int tid = 1;		
		List<News> list = new ArrayList<>();
		list = newsDao.getAllnewsByTID(tid);
		
		for(News aa:list) {
			System.out.println(aa.toString());
		}
		//ȡlist�����һ����¼	
		System.out.println("-----------------------");
		//��һ��
		System.out.println("��һ��"+list.get(0).toString());
		list.get(0);
		//���һ��
		System.out.println("���һ��"+list.get(list.size()-1).toString());
	}		
	
	@Test
	public void testfindUser() {

		String uname = "admin";
		String password = "admin";
		User user = new User();
		user = userDao.findUser(uname, password);
		
		System.out.println(user.toString());
	}
	
	
	@Test
	public void testgetLatestNewsByTID() {

		int tid =1;
		int limit =1;
		
		List<News> list = new ArrayList<>();
		list = newsDao.getLatestNewsByTID(tid, limit);
		for(News aa:list) {
			System.out.println(aa.toString());
		}
	}
	
	

	
}

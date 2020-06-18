package com.bookshop.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class HibernateUtils {
	private static SessionFactory factory;
	static{
		//1.获取核心配置文件对象，默认是加载src的hibernate.cfg.xml文件
		Configuration  cfg = new Configuration().configure();
		//2.创建会话工厂
		factory=cfg.buildSessionFactory();
		//监听程序关闭
		Runtime.getRuntime().addShutdownHook(new Thread(){
			public void run() {
				factory.close();
			};});
	}
	 
	public static Session openSession(){
		return factory.openSession();
	}
	
	public static Session getSession(){
		return factory.getCurrentSession();
	}
}

package com.bookshop.dao;

import java.io.Serializable;

import com.bookshop.entity.User;

public interface UserDao {
	
	/** 添加一条记录	
	 * @return 
	 * @throws Exception */		     
	public void AddUser(User user);
	
	/** 根据主键找对象 */	     
	public User get(String username);
	
}

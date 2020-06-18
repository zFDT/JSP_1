package com.bookshop.dao.Impl;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bookshop.dao.UserDao;
import com.bookshop.entity.User;
import com.bookshop.util.HibernateUtils;

public class UserDaoImpl implements UserDao {
	
	@Override
	public void AddUser(User user){
		try{
			Session session=HibernateUtils.openSession();
			Transaction trans=session.getTransaction();
			trans.begin();
			session.save(user);
			trans.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public User get(String username) {
		try{
			Session session=HibernateUtils.openSession();
			Transaction trans=session.getTransaction();
			trans.begin();
			User user=(User)session.get(User.class, username);
			System.out.println(user);
			trans.commit();
			session.close();
			return user;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

}

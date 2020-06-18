package com.bookshop.dao.Impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.bookshop.dao.CarDao;
import com.bookshop.entity.Book;
import com.bookshop.entity.Car;
import com.bookshop.entity.User;
import com.bookshop.util.HibernateUtils;

public class CarDaoImpl implements CarDao {

	@Override
	public void Addbook(Car car) {
		try{
			Session session=HibernateUtils.openSession();
			Transaction trans=session.getTransaction();
			trans.begin();
			session.save(car);
			trans.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public List<Car> getcar(String username) {
		try{
			Session session=HibernateUtils.openSession();
			Query query=session.createQuery("from Car");
			List<Car> cars=query.list();
			session.close();
			return cars;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void changcar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletebook(String username, int bookid) {
		try{
		Configuration  cfg = new Configuration().configure();
		final SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		session.getTransaction().begin();
		Query query=session.createQuery("from Car where username=? and bookid=?");
		query.setParameter(0, username);
		query.setParameter(1, bookid);
		Car car=(Car) query.uniqueResult();
		session.delete(car);
		session.getTransaction().commit();
		session.clear();
		factory.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
	

}

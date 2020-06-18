package com.bookshop.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bookshop.dao.BookDao;
import com.bookshop.entity.Book;
import com.bookshop.util.HibernateUtils;



public class BookDaoImpl implements BookDao {
	@Override
	public List<Book> getBook() {
		try{
			Session session=HibernateUtils.openSession();
			Query query=session.createQuery("from Book");
			List<Book> books = query.list();
			session.close();
			return books;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public Book findBook(int bookid) {
		try{
			Session session=HibernateUtils.openSession();
			Book book=(Book)session.get(Book.class, bookid);
			session.close();
			return book;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}

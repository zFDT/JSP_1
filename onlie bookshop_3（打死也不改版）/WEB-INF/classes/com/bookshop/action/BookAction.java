package com.bookshop.action;

import java.util.List;

import com.bookshop.dao.BookDao;
import com.bookshop.dao.Impl.BookDaoImpl;
import com.bookshop.entity.Book;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	public List<Book> books;
	BookDao bookdao=new BookDaoImpl();
	
	public String showbook(){
		books=bookdao.getBook();
		return SUCCESS;
		
	}
}

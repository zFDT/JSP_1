package com.bookshop.action;

import java.util.List;

import com.bookshop.dao.BookDao;
import com.bookshop.dao.CarDao;
import com.bookshop.dao.Impl.BookDaoImpl;
import com.bookshop.dao.Impl.CarDaoImpl;
import com.bookshop.entity.Book;
import com.bookshop.entity.Car;
import com.bookshop.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class carAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	public  List<Car> carbooks;
	private String username;
	CarDao cardao=new CarDaoImpl();
	BookDao bookdao=new BookDaoImpl();
	private String bookid;
	public String addcar(){
		Book book = bookdao.findBook(Integer.parseInt(bookid));
		cardao.Addbook(new Car(username,book,1));
		return SUCCESS;
	}
	
	public String deletecar(){
		cardao.deletebook(username,Integer.parseInt(bookid));
		return SUCCESS;
	}
	
	public String showcar(){
		carbooks=cardao.getcar(username);
		System.out.println("carbooks的大小为："+carbooks.size());
		return SUCCESS;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

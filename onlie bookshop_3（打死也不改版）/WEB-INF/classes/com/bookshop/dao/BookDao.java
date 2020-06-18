package com.bookshop.dao;

import java.util.List;

import com.bookshop.entity.Book;

public interface BookDao {
	public List<Book> getBook();
	
	public Book findBook(int bookid);
}

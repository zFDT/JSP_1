package com.bookshop.dao;

import java.io.Serializable;
import java.util.List;

import com.bookshop.entity.Car;



public interface CarDao {
		     
	public void Addbook(Car car);
	
	public void deletebook(String username,int bookid);
	
	public List<Car> getcar(String username);
	
	public void changcar(Car car);
	
}
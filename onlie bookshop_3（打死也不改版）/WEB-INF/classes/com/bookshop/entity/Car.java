package com.bookshop.entity;

import java.io.Serializable;

/**书籍实体类*/
public class Car implements Serializable {
	private String username;
	private int bookid;
	private int number;
	private String picture;
	private String name_ch;
	private String name_en;
	private String author_ch;
	private String author_en;
	private Double price;
	
	public Car() {
	}
	
	public Car(String username, Book book, int number) {
		this.username = username;
		this.bookid = book.getId();
		this.number = number;
		this.picture = book.getPicture();
		this.name_ch = book.getName_ch();
		this.name_en = book.getName_en();
		this.author_ch = book.getAuthor_ch();
		this.author_en = book.getAuthor_en();
		this.price = book.getPrice();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getName_ch() {
		return name_ch;
	}
	public void setName_ch(String name_ch) {
		this.name_ch = name_ch;
	}
	public String getName_en() {
		return name_en;
	}
	public void setName_en(String name_en) {
		this.name_en = name_en;
	}
	public String getAuthor_ch() {
		return author_ch;
	}
	public void setAuthor_ch(String author_ch) {
		this.author_ch = author_ch;
	}
	public String getAuthor_en() {
		return author_en;
	}
	public void setAuthor_en(String author_en) {
		this.author_en = author_en;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [username=" + username + ", bookid=" + bookid + ", number=" + number + ", picture=" + picture
				+ ", name_ch=" + name_ch + ", name_en=" + name_en + ", author_ch=" + author_ch + ", author_en="
				+ author_en + ", price=" + price + "]";
	}
	
	
	
}

package com.bookshop.entity;

import java.io.Serializable;

/**书籍实体类*/
public class Book implements Serializable {
	private Integer id;
	private String picture;
	private Double price;
	private String name_ch;
	private String name_en;
	private String author_ch;
	private String author_en;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
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
	@Override
	public String toString() {
		return "Book [id=" + id + ", picture=" + picture + ", price=" + price + ", name_ch=" + name_ch + ", name_en="
				+ name_en + ", author_ch=" + author_ch + ", author_en=" + author_en + "]";
	}

	
}

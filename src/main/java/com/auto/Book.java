package com.auto;

public class Book {
	
	int bookId;
	String bookName;
	int bookPrice;
	Author author;
	
	
	
	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public int getBookPrice() {
		return bookPrice;
	}



	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}



	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}



	public void show() {
		System.out.println(bookId + " "+ bookName + "  "+ bookPrice);
		System.out.println(author.toString());
	}
	

}

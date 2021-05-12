package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="librarymanagement")
public class libraryModel {

	@Id
	@GeneratedValue
	private int id;
	private int bookId;
	private int quantity;
	private String bookName;
	private String genre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public libraryModel(int id, int bookId, int quantity, String bookName, String genre) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.quantity = quantity;
		this.bookName = bookName;
		this.genre = genre;
	}
	public libraryModel() {
		super();
	}
	@Override
	public String toString() {
		return "libraryModel [id=" + id + ", bookId=" + bookId + ", quantity=" + quantity + ", bookName=" + bookName
				+ ", genre=" + genre + "]";
	}
	
	
	
	
	
}

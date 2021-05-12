package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.libraryRepo;
import com.example.demo.model.libraryModel;

@RestController
public class libraryController {
	
	@Autowired
	libraryRepo rp;
	
	@PostMapping("/saveBook")
	public void addBook(@RequestBody libraryModel ld)
	{
		rp.save(ld);
		System.out.println(ld);
	}
	@PostMapping("/editBook")
	public String updateBook(@RequestBody libraryModel ld, @RequestParam("bookId") int bookId)
	{
		if(rp.findByBookId(bookId)!=null)
		{
			int id=rp.findByBookId(bookId).getId();
			rp.deleteById(id);
			ld.setBookId(bookId);
			rp.save(ld);
			System.out.println(bookId);
			System.out.println(ld);
			return "Successfully updated";
		}
		else
		{
			return "No book found to Update";
		}
		
		

		
	}
	
	@PostMapping("/deleteBook")
	public String deleteBook(@RequestParam int bookId)
	{
		if(rp.findByBookId(bookId)!=null)
		{
			int id=rp.findByBookId(bookId).getId();
			rp.deleteById(id);
			return "Deleted Successfully";
		}
		else
		{
			return "No book found to delete";
		}
	}
	
	@PostMapping("/getBooks")
	public List<libraryModel> getallBook()
	{
		
		return (List<libraryModel>)rp.findAll();
		
	}
	@PostMapping("/getByType")
	public List<libraryModel> getBookGne(@RequestParam("genre") String gnre)
	{
		
		return (List<libraryModel>)rp.findByGenre(gnre);
	}
}

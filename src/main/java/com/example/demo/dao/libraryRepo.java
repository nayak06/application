package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.libraryModel;

public interface libraryRepo extends CrudRepository<libraryModel, Integer>{

	

	

	List<libraryModel> findByGenre(String gnre);



	libraryModel findByBookId(int bookId);



	void deleteByBookId(int bookId);

}

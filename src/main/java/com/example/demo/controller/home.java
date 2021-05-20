package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.series;
import com.example.demo.repo.webseries_repo;

@RestController
public class home {
	
	@Autowired
	private webseries_repo rp;

	@PostMapping("/addSeries")
	public String addSeries(@RequestBody series sr)
	{
		rp.save(sr);
		return "save success";
	}
	
	@GetMapping("/series")
	public List<series> getAll()
	{
		return (List<series>)rp.findAll();
	}
	
	@GetMapping("/series/id/{id}")
	public Optional<series> getbyId(@PathVariable("id") int id)
	{
		return rp.findById(id);
	}
	
	@GetMapping("/series/name/{name}")
	public Optional<series> getbyName(@PathVariable("name") String name)
	{
		return rp.findByName(name);
	}
	
	@DeleteMapping("/delete/{id}")
	public String getDelete(@PathVariable("id") int id)
	{
		int temp_id=id;
		rp.deleteById(id);
		return 	"Series Removed ! "+temp_id;
		
	}
	
	@PutMapping("/update")
	public String updateSeries(@RequestBody series sr)
	{
		int id=sr.getId();
		try {
			rp.deleteById(id);
			rp.save(sr);
			return null;
		}
		catch(Exception e)
		{
			return "No Web Series Found";
		}
	}
	
}

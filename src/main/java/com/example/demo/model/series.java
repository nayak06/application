package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="webseries_table")
public class series {
	
	@Id
	private int id;
	private String name;
	private int seasons;
	private int episodes;
	private int rating;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeasons() {
		return seasons;
	}
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public series(int id, String name, int seasons, int episodes, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.seasons = seasons;
		this.episodes = episodes;
		this.rating = rating;
	}
	public series() {
		super();
	}
	
	

}

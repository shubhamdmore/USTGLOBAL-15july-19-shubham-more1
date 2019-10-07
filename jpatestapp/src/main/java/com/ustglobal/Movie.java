package com.ustglobal;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// it represent entity class
@Table (name="movie")// to represent table

public  class Movie {
    @Id // it represent primary key
	@Column // it represent column
	private int id;
	@Column
    private String name;
	@Column
	private String rating;
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
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
}

package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="traniee")
public class Trainers {
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public Trainers(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	@Override
	public String toString()
	{
		return "id:"+id+"\n"+"name:"+name+"\n"+"city:"+city;
		
	}
	

}

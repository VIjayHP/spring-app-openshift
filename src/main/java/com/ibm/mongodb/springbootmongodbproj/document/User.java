package com.ibm.mongodb.springbootmongodbproj.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private Integer id;
	private String name;
	private Long sal;
	public User(Integer id, String name, Integer sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSal() {
		return sal;
	}
	public void setSal(Long sal) {
		this.sal = sal;
	}

}

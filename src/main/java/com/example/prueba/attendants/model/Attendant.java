package com.example.prueba.attendants.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Attendant {

	private String name;
	private String lastName;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}

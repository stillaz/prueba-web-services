package com.example.prueba.hotel.model;

import java.util.List;

import com.example.prueba.attendants.model.Attendant;

public class Hotel {

	private String name;
	private String place;
	private List<Attendant> attendants;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public List<Attendant> getAttendants() {
		return attendants;
	}

	public void setAttendants(List<Attendant> attendants) {
		this.attendants = attendants;
	}

}

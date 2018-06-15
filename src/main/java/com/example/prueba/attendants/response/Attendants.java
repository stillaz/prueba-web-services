package com.example.prueba.attendants.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.prueba.attendants.model.Attendant;

@XmlRootElement(name = "hotel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Attendants {
	
	@XmlElementWrapper(name = "attendants")
	@XmlElement(name = "attendant")
	private List<Attendant> attendants;

	public Attendants() {
		super();
	}

	public Attendants(List<Attendant> attendants) {
		super();
		this.attendants = attendants;
	}

	public List<Attendant> getAttendants() {
		return attendants;
	}

	public void setAttendants(List<Attendant> attendants) {
		this.attendants = attendants;
	}

}

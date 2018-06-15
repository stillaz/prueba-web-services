package com.example.prueba.attendants.controller;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.attendants.response.Attendants;
import com.example.prueba.attendants.service.AttendantService;

@RestController
public class AttendantController {

	@Autowired
	private AttendantService attendantService;

	@RequestMapping(value = "attendantsAgeLt23", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML)
	public Attendants getAttendants() throws IOException {
		return new Attendants(attendantService.getAttendantsAgeLt23());
	}

}

package com.example.prueba.attendants.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prueba.attendants.model.Attendant;
import com.example.prueba.attendants.service.AttendantService;
import com.example.prueba.hotel.model.Hotel;
import com.example.prueba.hotel.service.HotelService;

@Service
public class AttendantServiceImpl implements AttendantService {

	@Autowired
	private HotelService hotelService;

	@Override
	public List<Attendant> getAttendantsAgeLt23() throws IOException {
		Hotel hotel = hotelService.getHotel();

		List<Attendant> attendants = hotel.getAttendants();

		return attendants.stream().filter(attendant -> {
			return attendant.getAge() > 23;
		}).collect(Collectors.toList());
	}
}

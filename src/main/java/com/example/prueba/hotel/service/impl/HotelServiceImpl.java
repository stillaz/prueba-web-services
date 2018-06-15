package com.example.prueba.hotel.service.impl;

import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.example.prueba.hotel.model.Hotel;
import com.example.prueba.hotel.service.HotelService;
import com.example.prueba.util.ClientService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class HotelServiceImpl implements HotelService {

	private static final String DATA_URL = "http://demo4913571.mockable.io/wstest";

	@Override
	public Hotel getHotel() throws IOException {

		InputStream dataService = ClientService.get(DATA_URL, MediaType.APPLICATION_JSON);

		ObjectMapper mapper = new ObjectMapper();

		Hotel hotel = mapper.readValue(dataService, Hotel.class);

		return hotel;
	}
}

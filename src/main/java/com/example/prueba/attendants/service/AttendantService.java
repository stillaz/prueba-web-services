package com.example.prueba.attendants.service;

import java.io.IOException;
import java.util.List;

import com.example.prueba.attendants.model.Attendant;

public interface AttendantService {

	List<Attendant> getAttendantsAgeLt23() throws IOException;

}

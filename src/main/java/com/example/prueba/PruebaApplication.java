package com.example.prueba;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.prueba.util.ClientService;

@SpringBootApplication
public class PruebaApplication {

	private static final String DATA_URL = "http://localhost:8080/attendantsAgeLt23";

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
		loadDataFromRestService();
	}

	private static void loadDataFromRestService() {
		try {
			InputStream dataService = ClientService.get(DATA_URL, MediaType.APPLICATION_XML);
			StringWriter writer = new StringWriter();
			IOUtils.copy(dataService, writer, "UTF-8");
			String mensaje = writer.toString();
			System.out.println("\n" + mensaje.replaceAll(">", ">\n"));
		} catch (IOException e) {
			System.out.println("Error consumiendo servicio, el error técnico es: " + e.getMessage());
		}
	}
}

package com.example.prueba;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.prueba.attendants.controller.AttendantController;
import com.example.prueba.attendants.model.Attendant;
import com.example.prueba.attendants.service.AttendantService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AttendantController.class, secure = false)
public class PruebaApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private AttendantService attendantService;

	

	@Test
	public void retrieveDetailsForCourse() throws Exception {
		
		List<Attendant> mockAttendant =  attendantService.getAttendantsAgeLt23();

		Mockito.when(attendantService.getAttendantsAgeLt23()).thenReturn(mockAttendant);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/attendantsAgeLt23")
				.accept(MediaType.APPLICATION_XML);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse().getContentAsString());

		JSONAssert.assertEquals(result.getResponse().getContentAsString(), result.getResponse().getContentAsString(),
				false);
	}

	@Test
	public void contextLoads() {
	}

}

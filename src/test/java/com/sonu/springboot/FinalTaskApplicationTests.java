package com.sonu.springboot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sonu.springboot.Controller.TaskController;

@SpringBootTest
class FinalTaskApplicationTests {

	@Autowired
	TaskController st;

	@Test
	void AdditionTestcase() throws Exception {
		MockMvc mockmvc = MockMvcBuilders.standaloneSetup(st).build();
		mockmvc.perform(get("/addition?a=1&b=2")).andExpect(status().isOk());
		
		
		
		
	}
	@Test
	void SubtractionTestcase() throws Exception{
		MockMvc mockmvc = MockMvcBuilders.standaloneSetup(st).build();
		mockmvc.perform(get("/subtraction?a=1&b=2")).andExpect(status().isOk());
		
		
		
	}
	@Test
	void DivisionTestcase() throws Exception {
		MockMvc mockmvc = MockMvcBuilders.standaloneSetup(st).build();
		mockmvc.perform(get("/div?a=1&b=2")).andExpect(status().isOk());
		
		
	}
@Test
	void RandomTestcase() throws Exception {
	MockMvc mockmvc = MockMvcBuilders.standaloneSetup(st).build();
	mockmvc.perform(get("/ran?count=10")).andExpect(status().isOk());
	
	
		
		
	}

}

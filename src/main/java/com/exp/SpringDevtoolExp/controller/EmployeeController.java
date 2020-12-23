package com.exp.SpringDevtoolExp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping(path = "/test")
	public String m1() {
		return "Hello Spring Boot from get";

	}
	@PostMapping(path = "/test")
    public String m2() {
    	return "Hello Spring Boot from post";
    }
	@PutMapping(path = "/test")
	public String m3() {
		return "Hello Spring Boot from put";
		
	}
	@DeleteMapping(path="/test")
	public String  m4() {
		return "Hello Spring Boot from delete";
		
	}
}


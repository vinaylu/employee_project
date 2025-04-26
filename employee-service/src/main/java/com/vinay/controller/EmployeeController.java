package com.vinay.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.entity.Employee;
import com.vinay.response.EmployeeResponse;
import com.vinay.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empserv;

	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		List<Employee> emps=empserv.EmployeeServicess();
	
		return emps;
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable int id) {
		EmployeeResponse emps=empserv.employeeServicessfindById(id);
	
		return ResponseEntity.status(HttpStatus.OK).body(emps);
	}
	
	
}

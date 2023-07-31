package com.operations.EMS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operations.EMS.dto.EmployeeDto;
import com.operations.EMS.response.Response;
import com.operations.EMS.service.EmployeeService;

@RestController(value = "/employee")
public class Employee {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	public ResponseEntity<Response> upsert (EmployeeDto employee) {
		return new ResponseEntity<>(employeeService.upsert(employee), HttpStatus.OK);
	}
	
	@PostMapping("/remove")
	public ResponseEntity<Response> remove (@RequestBody final EmployeeDto employee) {
		return new ResponseEntity<>(employeeService.remove(employee), HttpStatus.OK);
	}
	
	
//	@PostMapping
//	public ResponseEntity<Object> employees (@Valid @RequestBody final EmployeeDTO employee) {
//		return new ResponseEntity<>(employeeService.remove(command), HttpStatus.OK);
//	}
//	
//	@PostMapping
//	public ResponseEntity<Object> employee (@Valid @RequestBody final EmployeeDTO employee) {
//		return new ResponseEntity<>(employeeService.remove(command), HttpStatus.OK);
//	}
}

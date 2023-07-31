package com.operations.EMS.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operations.EMS.dto.VehicleDto;
import com.operations.EMS.response.Response;
import com.operations.EMS.service.VehicleService;

@RestController
public class Vehicle {
	
	@Autowired
	private VehicleService service;

	@PostMapping
	public ResponseEntity<Response> upsert(@Valid @RequestBody final VehicleDto vehicle) {
		return new ResponseEntity<>(service.upsert(vehicle), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Response> remove(@Valid @RequestBody final VehicleDto vehicle) {
		return new ResponseEntity<>(service.remove(vehicle), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Response> status(@Valid @RequestBody final VehicleDto vehicle) {
		return new ResponseEntity<>(service.status(vehicle), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Response
	> progress(@Valid @RequestBody final VehicleDto vehicle) {
		return new ResponseEntity<>(service.progress(vehicle), HttpStatus.OK);
	}
	
}

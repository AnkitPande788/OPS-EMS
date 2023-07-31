package com.operations.EMS.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operations.EMS.dto.RouteDto;
import com.operations.EMS.service.RouteService;


@RestController(value = "/route")
public class Route {
	
	@Autowired
	private RouteService service;
	
	@PostMapping(value = "/")
	public ResponseEntity<Object> upsert(@Valid @RequestBody final RouteDto routeDto) {
		return new ResponseEntity<>(service.upsert(routeDto), HttpStatus.OK);
	}
	
	@PostMapping(value ="/remove")
	public ResponseEntity<Object> remove(@Valid @RequestBody final RouteDto routeDto) {
		return new ResponseEntity<>(service.remove(routeDto), HttpStatus.CREATED);
	}


}

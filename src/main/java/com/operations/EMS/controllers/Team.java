package com.operations.EMS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operations.EMS.dto.TeamDTO;
import com.operations.EMS.response.Response;
import com.operations.EMS.service.TeamService;

@RestController(value = "/team")
public class Team {
	
	@Autowired
	private TeamService service;

	@PostMapping(path = "/")
	public ResponseEntity<Response> upsert(TeamDTO teamDTO) {
		return new ResponseEntity<>(service.upsert(teamDTO), HttpStatus.OK);
	}
					
	@PostMapping(path="/remove")
	public ResponseEntity<Response> remove(TeamDTO teamDTO) {
		return new ResponseEntity<>(service.remove(teamDTO), HttpStatus.OK);
	}
	
//	@PostMapping(path = "/asginee")
//	public ResponseEntity<Response> asignee(VehicleAssigneeDTO vehicleAssigneeDTO) {
////		return new ResponseEntity<>(service.asignee(vehicleAssigneeDTO), HttpStatus.OK);
//	}
	
}

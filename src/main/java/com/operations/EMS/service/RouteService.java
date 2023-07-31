package com.operations.EMS.service;

import javax.validation.Valid;

import com.operations.EMS.dto.RouteDto;
import com.operations.EMS.response.Response;

public interface RouteService {

	/**
	 * 
	 * @param routeDto
	 * @return
	 */
	Response upsert(@Valid RouteDto routeDto);

	/**
	 * 
	 * @param routeDto
	 * @return
	 */
	Response remove(@Valid RouteDto routeDto);

}

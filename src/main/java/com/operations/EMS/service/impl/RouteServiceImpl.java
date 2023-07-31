package com.operations.EMS.service.impl;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.operations.EMS.dto.RouteDto;
import com.operations.EMS.dto.RouteStateDto;
import com.operations.EMS.entities.Route;
import com.operations.EMS.repo.RouteDao;
import com.operations.EMS.response.Response;
import com.operations.EMS.service.RouteService;

@Service
public class RouteServiceImpl implements RouteService {

	@Autowired
	private RouteDao dao;

//	private ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public Response upsert(RouteDto routeDto) {
		Route route = dao.findById(routeDto.getRouteId()).get();
		if (route != null) {
			route = new Route();
			populateRoute(route, routeDto);
// TODO:
//			populateState(route, routeDto);
//			populateCity(route, routeDto);
		}
		populateRoute(route, routeDto);
		dao.save(route);
		return new Response();
	}

// TODO:
//	private void populateCity(Route route, RouteDto routeDto) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void populateState(Route route, RouteDto routeDto) {
//		List<RouteStateDto> statesDto = routeDto.getStates();
//		objectMapper.readValue(statesDto, valueType);
//	}

	private void populateRoute(Route route, RouteDto routeDto) {
		route.setRouteName(routeDto.getRouteName());
		route.setRouteStatus(Boolean.TRUE); // Take from route Dto
	}

	@Override
	public Response remove(RouteDto routeDto) {
		Route route = dao.findById(routeDto.getRouteId()).get();
		if (route != null) {
			route = new Route();
			populateRoute(route, routeDto);
//			populateState(route, routeDto);
//			populateCity(route, routeDto);
		}
		route.setRouteStatus(Boolean.FALSE);
		dao.save(route);
		return new Response();
	}

}

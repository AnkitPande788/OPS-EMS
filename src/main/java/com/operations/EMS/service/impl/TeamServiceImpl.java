package com.operations.EMS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.operations.EMS.dto.TeamDTO;
import com.operations.EMS.dto.VehicleAssigneeDTO;
import com.operations.EMS.entities.Route;
import com.operations.EMS.entities.Team;
import com.operations.EMS.repo.TeamDao;
import com.operations.EMS.response.Response;
import com.operations.EMS.service.TeamService;

public class TeamServiceImpl implements TeamService {
	
	
	
	@Autowired
	private TeamDao dao; 
	
	
	@Override
	public Response upsert(TeamDTO teamDto) {
		Team team = dao.findById(teamDto.getId()).get();
		if (team != null) {
			team = new Team();
			populateTeam(team, teamDto);
// TODO:
//			populateState(route, routeDto);
//			populateCity(route, routeDto);
		}
		populateTeam(team, teamDto);
		dao.save(team);
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

	private void populateTeam(Team team, TeamDTO teamDto) {
		team.setTeamStatus(teamDto.getTeamStatus());
//		route.setisRolling(Boolean.TRUE); // Take from route Dto
	}

	@Override
	public Response remove(TeamDTO teamDto) {
		Team team = dao.findById(teamDto.getId()).get();
		if (team != null) {
			team = new Team();
			populateTeam(team, teamDto);
		}
		dao.save(team);
		return new Response();
	}

	public Response asignee(VehicleAssigneeDTO vehicleAssigneeDTO) {
		return null;
	}

}

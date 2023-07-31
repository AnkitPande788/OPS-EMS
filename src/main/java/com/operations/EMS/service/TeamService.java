package com.operations.EMS.service;

import com.operations.EMS.dto.TeamDTO;
import com.operations.EMS.entities.Team;
import com.operations.EMS.response.Response;

public interface TeamService{	
	
	public Response upsert(TeamDTO teamDto);

	public Response remove(TeamDTO teamDto);
}

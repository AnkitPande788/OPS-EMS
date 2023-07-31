package com.operations.EMS.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RouteStateDto {
	
	private String state;
	private List<RouteCitesDTO> cities;

}

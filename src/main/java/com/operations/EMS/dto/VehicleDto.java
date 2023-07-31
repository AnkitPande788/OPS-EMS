package com.operations.EMS.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDto {
	
	
	private Long id;
	
	private Long vehicleCode;
	
	private Integer vehicleStatus	;
	
	private Integer routeId;
	
	private String vehicleEnumStatus;

}

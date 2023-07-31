package com.operations.EMS.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeamDTO {
	
	private Long id;
	
	private Long employeeId;
	
	private Boolean isRolling;
	
	private Integer teamStatus;

}

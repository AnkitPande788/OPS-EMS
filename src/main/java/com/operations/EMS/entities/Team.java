package com.operations.EMS.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "employee_id")
	private Long employeeId;

	@Column
	private Boolean isRolling;

	@Column(name = "team_status")
	private Integer teamStatus;
	
	@OneToMany(mappedBy = "team")
	private List<Vehicle> vehicles;

}

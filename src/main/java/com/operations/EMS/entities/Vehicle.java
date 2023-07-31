package com.operations.EMS.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Vehicle {

	@Id
	@Column(name = "vehicle_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Id
	@Column(name = "route_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long routeId;

	@Column(name = "vehicle_status")
	private Integer vehicleStatus;

	@Column(name = "vehicle_code")
	private String vehicleCode;
	
	@ManyToOne
	@JoinColumn(name="team_id")
	private Team team;

}

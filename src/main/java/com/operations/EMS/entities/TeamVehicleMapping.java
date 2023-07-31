package com.operations.EMS.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;

@Entity
@Table(name = "team_vehcicle_mapping")
@NamedEntityGraph(
	    name = "TeamVehicle.team",
	    attributeNodes = @NamedAttributeNode("team")
		)
public class TeamVehicleMapping {
	
	@Id
	private Long id;
	
	@Column
	@ManyToOne(fetch = FetchType.LAZY)
	private Vehicle vehicle;
	
}

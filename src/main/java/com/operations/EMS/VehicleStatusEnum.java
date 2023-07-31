package com.operations.EMS;

public enum VehicleStatusEnum {
	
    OUT_OF_DEPOT	(1, "OUT_OF_DEPOT"),
    ON_THE_ROUTE(2, "ON_THE_ROTE"),
	OUT_OF_SERVICE (3, "OUT_OF_SERVICE"),		
	REACHED_DESTINATION(4, "REACHED_DESTINATION"),
	IN_DEPOT(5, "IN_DEPOT");
	
	private Integer id;
	private String vehicleStatus;
	
	VehicleStatusEnum(Integer id, String vehicleStatus) {
		this.id = id;
		this.vehicleStatus = vehicleStatus;
	}
	
	VehicleStatusEnum() {
		this.id = id;
		this.vehicleStatus = vehicleStatus;
	}

}

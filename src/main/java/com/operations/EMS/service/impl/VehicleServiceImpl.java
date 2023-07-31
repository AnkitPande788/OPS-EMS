package com.operations.EMS.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operations.EMS.VehicleStatusEnum;
import com.operations.EMS.dto.VehicleDto;
import com.operations.EMS.entities.Vehicle;
import com.operations.EMS.repo.VehicleDao;
import com.operations.EMS.response.Response;
import com.operations.EMS.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleDao dao;

	@Override
	public Response upsert(@Valid VehicleDto vehicleDto) {
		Vehicle vehicle = dao.findByVehicleId(vehicleDto.getId()).get();
		if (vehicle != null) {
			vehicle = new Vehicle();
			populateVehicle(vehicle, vehicleDto);
// TODO:
//			populateState(route, routeDto);
//			populateCity(route, routeDto);
		}
		populateVehicle(vehicle, vehicleDto);
		dao.save(vehicle);
		return new Response();
	}

	private void populateVehicle(Vehicle vehicle, @Valid VehicleDto vehicleDto) {

		vehicle.setRouteId(vehicleDto.getId());
		vehicle.setVehicleStatus(vehicleDto.getVehicleStatus());

	}

	@Override
	public Response remove(@Valid VehicleDto vehicleDto) {
		Vehicle vehicle = dao.findByVehicleId(vehicleDto.getId()).get();
		if (vehicle != null) {
			vehicle = new Vehicle();
			populateVehicle(vehicle, vehicleDto);
		}
		dao.save(vehicle);
		return new Response();
	}

	@Override
	public Response status(@Valid VehicleDto vehicleDto) {
		Vehicle vehicle = dao.findByVehicleId(vehicleDto.getId()).get();
		vehicle.setVehicleStatus(vehicleDto.getVehicleStatus());
		dao.save(vehicle);
		return new Response();
	}

	@Override
	public Response progress(@Valid VehicleDto vehicle) {
		List<VehicleStatusEnum> vehicleEnums = Arrays.asList(VehicleStatusEnum.values());
		List<VehicleStatusEnum>supplies = vehicleEnums.parallelStream().filter(en -> en.valueOf(vehicle.getVehicleEnumStatus()).ordinal() <= VehicleStatusEnum.valueOf(vehicle.getVehicleEnumStatus()).ordinal()).collect(Collectors.toList());
		return new Response (supplies);
	}

}

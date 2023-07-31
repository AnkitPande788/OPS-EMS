package com.operations.EMS.service;

import javax.validation.Valid;

import com.operations.EMS.dto.VehicleDto;
import com.operations.EMS.response.Response;

public interface VehicleService {

	Response upsert(@Valid VehicleDto vehicle);

	Response remove(@Valid VehicleDto vehicle);

	Response status(@Valid VehicleDto vehicle);

	Response progress(@Valid VehicleDto vehicle);

}

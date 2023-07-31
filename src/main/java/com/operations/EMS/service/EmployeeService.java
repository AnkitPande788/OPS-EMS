package com.operations.EMS.service;

import com.operations.EMS.dto.EmployeeDto;
import com.operations.EMS.response.Response;

public interface EmployeeService {

	Response upsert(EmployeeDto employee);

	Response remove(EmployeeDto employee);

}

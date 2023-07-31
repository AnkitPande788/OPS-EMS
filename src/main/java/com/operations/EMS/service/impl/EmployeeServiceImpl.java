package com.operations.EMS.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operations.EMS.dto.EmployeeDto;
import com.operations.EMS.entities.Employee;
import com.operations.EMS.repo.EmployeeDao;
import com.operations.EMS.response.Response;
import com.operations.EMS.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Response upsert(EmployeeDto employee) {
		Employee emp = findEmployee(employee);
		populateEmployee(employee, emp);
		dao.save(emp);
		return new Response();
	}

	private void populateEmployee(EmployeeDto employee, Employee emp) {
		emp.setEmployeeName(employee.getEmployeeName());
		emp.setStatus(Boolean.TRUE);	
	}

	private Employee findEmployee(EmployeeDto employee) {
		Optional<Employee> emp = dao.findById(employee.getId());
//		Employee emp = dao.findByEmployeeId(employee.getEmployeeId());
//		Employee emp = dao.findByEmployeeName(employee.getEmployeeId());
//		Employee emp = dao.findByEmployee(employee.getEmployeeId());
		return emp.isPresent() ? emp.get() : new Employee();
	}

	@Override
	public Response remove(EmployeeDto employee) {
		Employee emp = findEmployee(employee);
		emp.setStatus(Boolean.FALSE);
		dao.save(emp);
		return new Response();
	}

}

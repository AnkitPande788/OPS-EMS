package com.operations.EMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operations.EMS.entities.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}

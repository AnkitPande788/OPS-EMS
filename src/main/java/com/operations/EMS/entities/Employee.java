package com.operations.EMS.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Employee {

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@Column(name ="employee_id")
//	private String employeeId;

	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "employee_status", columnDefinition = "TINYINT(1)")
	private Boolean status;

}

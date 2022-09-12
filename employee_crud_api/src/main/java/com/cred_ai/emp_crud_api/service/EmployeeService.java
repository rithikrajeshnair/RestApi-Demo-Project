package com.cred_ai.emp_crud_api.service;

import java.util.List;

import com.cred_ai.emp_crud_api.entity.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);
	public Employee getEmployee(Long empId);
	public List<Employee> getAllEmployees();
	public Employee updateEmployee(Long empId, Employee employee);
	public boolean deleteEmployee(Long empId);

}

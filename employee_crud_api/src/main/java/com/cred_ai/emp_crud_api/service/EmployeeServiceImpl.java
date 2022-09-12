package com.cred_ai.emp_crud_api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cred_ai.emp_crud_api.entity.Employee;
import com.cred_ai.emp_crud_api.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
    private EmployeeRepository employeeRepository;	
	
	@Override
	public Employee createEmployee(Employee employee) {

		Employee emp = employeeRepository.save(employee);
		return emp;
	}

	@Override
	public Employee getEmployee(Long empId) {
		
//		employeeRepository.findById(empId) this will give an optional object, so in order to convert it
//	to object we have to use get() 
		Employee emp = (employeeRepository.findById(empId)).get();
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList = employeeRepository.findAll();
		
		return employeeList;
	}

	@Override
	public Employee updateEmployee(Long empId, Employee employee) {
		Optional<Employee> empDB = employeeRepository.findById(empId);
		if(empDB.isPresent()) {
			Employee emp = empDB.get();
			emp.setName(employee.getName());
			emp.setAge(employee.getAge());
			emp.setSalary(employee.getSalary());
			emp.setAddress(employee.getAddress());
			return employeeRepository.save(emp);
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(Long empId) {
		Optional<Employee> empDB = employeeRepository.findById(empId);
		if(empDB.isPresent()) {
			employeeRepository.deleteById(empId);
			return true;
		}
		return false;
	}



}

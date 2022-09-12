package com.cred_ai.emp_crud_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cred_ai.emp_crud_api.entity.Employee;
import com.cred_ai.emp_crud_api.service.EmployeeService;

@RestController //letting know this is a controller
@RequestMapping("/api/employee")
public class EmployeeController {
//	
	@Autowired // asking sts to create an object of this, if we are creating an object its the developers responsibility to maintain and manage it.
	private EmployeeService employeeService;

	@PostMapping // /api/employee
	public ResponseEntity<Employee> createEmployee( @RequestBody Employee employee ){
		System.out.println(employee.getName());
		Employee emp = employeeService.createEmployee(employee);
		  		
		System.out.println("I am inside createEmployee");
		return new ResponseEntity<> (emp,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{empId}")///api/employee/1001
    public ResponseEntity<Employee> findEmployeeById(@PathVariable(value = "empId") long empId) {
		Employee employee = employeeService.getEmployee(empId);
    	
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	
	@GetMapping //     /api/employee
    public ResponseEntity<List<Employee>> findAllEmployees() {
    	
    	List<Employee> employeeList = employeeService.getAllEmployees();
    	return new ResponseEntity<>(employeeList, HttpStatus.OK);
	}
	
	@PutMapping("/{empId}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "empId") long empId, @RequestBody Employee employee){
		Employee emp = employeeService.updateEmployee(empId, employee);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{empId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable( value = "empId" ) long empId){
		boolean isEmployeeDeleted = employeeService.deleteEmployee(empId);
		if(isEmployeeDeleted) {
			return new ResponseEntity<String>("Employee with ID "+ empId + " Deleted Sucessfully.",HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Employee with ID "+ empId + " Does not exist.",HttpStatus.NO_CONTENT);
		}
	}
	
}

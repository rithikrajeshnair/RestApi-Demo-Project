package com.cred_ai.emp_crud_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cred_ai.emp_crud_api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

// All this below methods are available by default
//save()
//findById()
//findAll()
//deleteById()
//delete()
//count()

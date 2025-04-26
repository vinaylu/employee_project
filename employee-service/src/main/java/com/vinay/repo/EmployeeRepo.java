package com.vinay.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
}

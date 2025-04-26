package com.vinay.services;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinay.entity.Employee;
import com.vinay.repo.EmployeeRepo;
import com.vinay.response.EmployeeResponse;

@Service
public class EmployeeService {

		@Autowired
		private EmployeeRepo emprepo;
		
		@Autowired
		private ModelMapper modelMaper;
		
		public List<Employee> EmployeeServicess() {
			List<Employee> emp=emprepo.findAll();
			
			
			return emp;
		}
		
		

		public EmployeeResponse employeeServicessfindById(int id) {
			
			Employee emp=emprepo.findById(id).get();
			
			EmployeeResponse er=modelMaper.map(emp, EmployeeResponse.class);
//			EmployeeResponse er=new EmployeeResponse();
//			er.setId(emp.getId());
//			er.setName(emp.getName());
//			er.setCode(emp.getCode());
//			er.setType(emp.getType());
//			
			return er;
		}
		
		
		
}


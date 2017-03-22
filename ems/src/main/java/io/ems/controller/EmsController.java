package io.ems.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.ems.entity.Employee;
import io.ems.service.EmsService;

@RestController
@RequestMapping(value = "")
public class EmsController {
	
	public EmsService service;
	
	@RequestMapping(method=RequestMethod.POST)
	public Employee create(@RequestBody Employee employee){
		return service.create(employee);
	}
	
	public Employee update(){
		return null;
	}
	
	public List<Employee> findByName(String fName, String lName){
		return null;
	}
	
	public Employee findById(String id){
		return null;
	}
	
	public Employee findActiveEmployee(){
		return null;
	}

}

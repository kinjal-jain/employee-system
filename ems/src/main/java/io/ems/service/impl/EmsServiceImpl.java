package io.ems.service.impl;

import io.ems.entity.Employee;
import io.ems.repository.EmsRepository;
import io.ems.service.EmsService;

public class EmsServiceImpl implements EmsService {
	
	public EmsRepository repository;
	
	@Override
	public Employee create(Employee employee) {
		return repository.save(employee);
	}

}

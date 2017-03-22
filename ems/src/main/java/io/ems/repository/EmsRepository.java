package io.ems.repository;

import org.springframework.data.repository.Repository;

import io.ems.entity.Employee;

public interface EmsRepository extends Repository<Employee, String> {

	Employee save(Employee employee);

}

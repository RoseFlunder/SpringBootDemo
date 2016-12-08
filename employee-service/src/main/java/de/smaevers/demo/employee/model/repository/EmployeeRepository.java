package de.smaevers.demo.employee.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.smaevers.demo.employee.model.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

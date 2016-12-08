package de.smaevers.demo.employee.model.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import de.smaevers.demo.employee.model.entities.Employee;
import de.smaevers.demo.employee.model.repository.EmployeeRepository;

@Component
public class DemoDataLoader implements CommandLineRunner{

	private final EmployeeRepository repository;

	@Autowired
	public DemoDataLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
		this.repository.save(new Employee("Michael", "Schott", "student"));
	}

}

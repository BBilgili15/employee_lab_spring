package com.codeclan.example.employees;

import com.codeclan.example.employees.models.Employee;
import com.codeclan.example.employees.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Employee alex = new Employee("Alex", 25, 13579, "alex@cc.com");
		employeeRepository.save(alex);
	}

}

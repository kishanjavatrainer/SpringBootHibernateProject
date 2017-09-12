package com.infotech.app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.app.entities.Employee;

@SpringBootApplication
public class SpringBootHibernateProjectApplication implements CommandLineRunner{

	@Autowired
	private EmployeeDao employeeDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Employee employee = getEmployee();
		employeeDao.createEmployee(employee);
	}
	private Employee getEmployee() {
		Employee employee= new  Employee();
		employee.setName("Sean Murphy");
		employee.setSalary(80000.00);
		employee.setDoj(new Date());
		return employee;
	}
}

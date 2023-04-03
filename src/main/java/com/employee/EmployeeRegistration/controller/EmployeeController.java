package com.employee.EmployeeRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.EmployeeRegistration.model.Employee;
import com.employee.EmployeeRegistration.service.EmployeeService;

/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/registration")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/addemps")
	public Employee addemp(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	@GetMapping("/employees/{id}")
	public List<Employee>getAllEmployee(){
		return employeeService.getEmployees();
	}

	@PutMapping("/update/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	@DeleteMapping("deleteemployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id);
	}

}

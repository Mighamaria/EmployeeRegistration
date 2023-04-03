package com.employee.EmployeeRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeRegistration.model.Employee;
import com.employee.EmployeeRegistration.respository.EmployeeRepo;

/**
 * @author Administrator
 *
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeerepo;

	public Employee createEmployee(Employee employee) {
	      return employeerepo.save(employee);
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeerepo.findAll();
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeerepo.findById(id).orElse(null) ;
	}

	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee oldemployee= null;
		Optional<Employee> optionalemployee =employeerepo.findById(employee.getId());
		if(optionalemployee.isPresent()) {
			oldemployee=optionalemployee.get();
			oldemployee.setEmpname(employee.getEmpname());
			oldemployee.setAddress(employee.getAddress());
			oldemployee.setLocation(employee.getLocation());
			employeerepo.save(oldemployee);
			}else {
				return new Employee();
			}
		return oldemployee;
	}

	public String deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}


package com.employee.EmployeeRegistration.respository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.employee.EmployeeRegistration.model.Employee;
   import org.springframework.*;
/**
	 * @author Administrator
	 *
	 */
	@Repository
	public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

	}


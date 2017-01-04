package org.mnr.dao;

import java.util.List;

import org.mnr.model.Employee;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Naveen Reddy
 *
 */

public interface EmployeeDAO {
	
	public Employee getById(int id);
	
	public boolean insert(Employee employee);
	
	public boolean update(Employee employee);
	
	public boolean delete (Employee employee);
	
	public boolean merge(List<Employee> employees);

}

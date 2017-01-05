package org.mnr.dao;

import java.util.Collection;
import org.mnr.model.Employee;

/**
 * 
 * @author Naveen Reddy
 *
 */

public interface EmployeeDAO {
	
	public Employee getByCode(int id);
	
	public boolean save(Employee employee);
	
	public boolean merge(Employee employee);
	
	public boolean delete (Employee employee);
	
	public void mergeEmployees(Collection<Employee> employees);
	
	public Collection<Employee> getAllEmployees();

}

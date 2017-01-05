package org.mnr.usecases;

import java.util.ArrayList;
import java.util.Collection;

import org.mnr.model.Employee;

public class UseCase2 {
	
	private Collection<Employee> employeeList;

	public UseCase2(Collection<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	public void add(Employee employee){
		if(!employeeList.contains(employee))
			employeeList.add(employee);
	}
	
	public static void main(String[] args) {
		UseCase2 useCase2 = new UseCase2(new ArrayList<Employee>());
			
		useCase2.add(new Employee (001, "XXX", "Infrastructure","8888888887"));
		useCase2.add(new Employee (004, "WWW", "Security", "7777777777" ));
		useCase2.add(new Employee (001, "XXX", "Infrastructure","8888888887"));
		useCase2.add(new Employee (001, "XXX", "Infrastructure","8888888887"));
		
		

	}

	

}
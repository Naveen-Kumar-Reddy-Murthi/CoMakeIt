package org.mnr.usecases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.mnr.model.Employee;

public class UseCase2 { 
	
	


	
	public static void main(String[] args) {
		
		List<Iterator<Employee>> empIterators = new ArrayList<Iterator<Employee>>();
		Collection<Employee> employeeList = new CopyOnWriteArrayList<Employee>();
			
		employeeList.add(new Employee (001, "XXX", "Infrastructure","8888888887"));
		employeeList.add(new Employee (004, "WWW", "Security", "7777777777" ));
		employeeList.add(new Employee (003, "XXX", "Infrastructure","8888888887"));
		employeeList.add(new Employee (005, "PPP", "Infrastructure","8888888887"));
		
		Iterator<Employee> itr1 = employeeList.iterator();
		
		Collection<Employee> employeeList2 = new CopyOnWriteArrayList<Employee>();
		
		employeeList2.add(new Employee (001, "XXX", "Infrastructure","8888888887"));
		employeeList2.add(new Employee (004, "WWW", "Security", "7777777777" ));
		employeeList2.add(new Employee (002, "QQQ", "Infrastructure","8888888887"));
		employeeList.add(new Employee (003, "XXX", "Infrastructure","8888888887"));
		
		Iterator<Employee> itr2 = employeeList2.iterator();
		
		empIterators.add(itr1);
		empIterators.add(itr2);
		insertEmployees(empIterators);

	}
	
	public static  Collection<Employee> insertEmployees(List<Iterator<Employee>> empIterators){
		 Collection<Employee> employeeList = new ArrayList<Employee>();
		 Employee emp = null;
		 for(Iterator<Employee> itr:empIterators){
			 while(itr.hasNext())
			 {
				 emp = itr.next();
				 if(!employeeList.contains(emp))
					 employeeList.add(emp);
			 }
		 }
		 System.out.println(employeeList);
		 return employeeList;
}
}
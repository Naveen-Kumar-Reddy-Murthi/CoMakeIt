package org.mnr.usecases;

import java.util.ArrayList;
import java.util.Collection;

import org.mnr.dao.EmployeeDAO;
import org.mnr.dao.EmployeeDAOImpl;
import org.mnr.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Naveen Reddy
 *
 */
public class UseCase1 {
	
	public static void main(String...args){
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeDAO dao = context.getBean("employeeDAOImpl", EmployeeDAOImpl.class);
		
		Collection<Employee> updatedRecordList = new ArrayList<Employee>();
		
		updatedRecordList.add(new Employee (001, "XXX", "Infrastructure","8888888887"));
		updatedRecordList.add(new Employee (004, "WWW", "Security", "7777777777" ));
		updatedRecordList.add(new Employee (003, "ZZZ", "Catering", "9999999999"));
		
		dao.mergeEmployees(updatedRecordList);
		
		
		
	}

}

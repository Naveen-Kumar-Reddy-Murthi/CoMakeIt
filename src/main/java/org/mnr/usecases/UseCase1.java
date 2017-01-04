package org.mnr.usecases;

import org.mnr.dao.EmployeeDAO;
import org.mnr.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCase1 {
	
	public static void main(String...args){
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeDAO dao = context.getBean("employeeDAOImpl", EmployeeDAO.class);
		
		Employee employee = new Employee();
		
		employee.setCode(3);
		employee.setName("Naveen");
		employee.setDepartment("PES");
		employee.setPhoneNumber("9990144007");
		
		dao.insert(employee);
		
		
		
	}

}

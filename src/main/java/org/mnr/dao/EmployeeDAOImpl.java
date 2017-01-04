package org.mnr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.mnr.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory; 
import org.hibernate.classic.Session;

@Repository(value = "employeeDAOImpl")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean merge(List<Employee> employees) {
		// TODO Auto-generated method stub
		return false;
	}
		
	
	
	
	@Override
	public Employee getById(int id) {
		return null;
	}
	
	@Override
	public boolean insert(Employee employee) {
		int id= -1;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		  session.persist(employee);
		session.getTransaction().commit();
		session.close();
		if(id >0)
			return true;
		else
		return false;
	}

	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	private static final class EmployeeMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setCode(resultSet.getInt("CODE"));
			employee.setName(resultSet.getString("NAME"));
			employee.setDepartment(resultSet.getString("DEPARTMENT"));
			employee.setPhoneNumber(resultSet.getString("PHONENUMBER"));
			return employee;
		}
		
	}

}

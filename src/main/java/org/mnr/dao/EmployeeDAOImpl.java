package org.mnr.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.mnr.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * 
 * @author Naveen Reddy
 *
 */

@Repository(value = "employeeDAOImpl")
public class EmployeeDAOImpl implements EmployeeDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void mergeEmployees(Collection<Employee> updatedRecordList) {
		Employee temEmployee = null;

		for (Employee employee : updatedRecordList) {

			temEmployee = getByCode(employee.getCode());

			if (temEmployee == null)
				save(employee);
			else
				merge(employee);

		}

		Collection<Employee> backUpRecordList = getAllEmployees();

		backUpRecordList.removeAll(updatedRecordList);

		for (Employee employee : backUpRecordList) {
			delete(employee);
		}

	}

	@Override @Transactional(rollbackFor = Exception.class)
	public boolean save(Employee employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();

		return true;
	}

	@Override
	public boolean merge(Employee employee) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(employee);
		session.getTransaction().commit();
		session.close();

		return true;
	}

	@Override
	public boolean delete(Employee employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(employee);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public Collection<Employee> getAllEmployees() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		@SuppressWarnings("unchecked")
		ArrayList<Employee> employeeRecords = (ArrayList<Employee>) criteria
				.list();
		return employeeRecords;
	}

	@Override
	public Employee getByCode(int id) {
		Session session = sessionFactory.openSession();
		Employee employee = (Employee) session.get(Employee.class, 1);
		return employee;
	}
}

package org.mnr.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author Naveen Reddy
 *
 */
@Entity
public class Employee {
	@Id
	private int code;
	private String name;
	private String department;
	private String phoneNumber;
	public Employee() {
	}
	
	
	public Employee(int code, String name, String department, String phoneNumber) {
		this.code = code;
		this.name = name;
		this.department = department;
		this.phoneNumber = phoneNumber;
	}


	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result
				+ ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (code != other.code)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append(", department=");
		builder.append(department);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append("]");
		return builder.toString();
	}
	

}

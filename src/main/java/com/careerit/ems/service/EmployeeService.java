package com.careerit.ems.service;

import java.util.List;

import com.careerit.ems.domain.Employee;

public interface EmployeeService {

		public Employee addEmployee(Employee employee);
		public List<Employee> getEmployees();
		public Employee updateEmployee(Employee employee);
		public boolean deleteEmployee(Long empno);
		public Employee getEmployee(Long empno);
}

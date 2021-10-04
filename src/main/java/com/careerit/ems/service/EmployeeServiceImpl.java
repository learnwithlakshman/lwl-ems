package com.careerit.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerit.ems.domain.Employee;
import com.careerit.ems.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepo employeeRepo;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {

		return employeeRepo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return employeeRepo.save(employee);
	}

	@Override
	public boolean deleteEmployee(Long empno) {

		employeeRepo.deleteById(empno);

		return true;
	}

	@Override
	public Employee getEmployee(Long empno) {

		return employeeRepo.findById(empno).get();
	}

}

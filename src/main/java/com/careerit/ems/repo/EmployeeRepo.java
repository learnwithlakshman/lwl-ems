package com.careerit.ems.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerit.ems.domain.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{

}

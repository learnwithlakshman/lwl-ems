package com.careerit.ems.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.ems.domain.Employee;
import com.careerit.ems.service.EmployeeService;

@RestController
@RequestMapping("/api/ems/")
public class EmployeeController {
		
		@Autowired
		private EmployeeService employeeService;
		
		@PostMapping
		public Employee addEmployee(@RequestBody Employee employee) {
			return employeeService.addEmployee(employee);
		}
		
		@PutMapping
		public Employee updateEmployee(@RequestBody Employee employee) {
			return employeeService.addEmployee(employee);
		}
		
		@GetMapping("/all")
		public List<Employee> getEmployees(){
			return employeeService.getEmployees();
		}
		@GetMapping("/{empno}")
		public Employee getEmployee(@PathVariable("empno")Long empno) {
			return employeeService.getEmployee(empno);
		}
		
		@DeleteMapping("/{empno}")
		public Boolean deleteEmployee(@PathVariable("empno")Long empno) {
			return employeeService.deleteEmployee(empno);
		}
}

package com.example.EmplyeeManagementApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmplyeeManagementApp.Service.EmployeeService;
import com.example.EmplyeeManagementApp.model.Employee; 

@RestController
public class EmployeeController {

	@Autowired 
	private EmployeeService employeeService;
	
	@GetMapping("/Employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee updatedEmployee) {
		return employeeService.updateEmployee(id,updatedEmployee);
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}
	
}

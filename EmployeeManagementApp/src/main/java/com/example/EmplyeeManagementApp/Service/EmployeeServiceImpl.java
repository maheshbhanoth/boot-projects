package com.example.EmplyeeManagementApp.Service;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmplyeeManagementApp.Repo.EmployeeRepo;
import com.example.EmplyeeManagementApp.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
	@Override
	public Employee getEmployeeById(Long id){
		return employeeRepo.findById(id).orElse(null);
	}
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@Override
	public Employee updateEmployee(Long id, Employee updatedEmployee) {
		Optional<Employee> optionalEmployee = employeeRepo.findById(id);
		if(optionalEmployee.isPresent()) {
			Employee existingEmployee = optionalEmployee.get();
			existingEmployee.setId(updatedEmployee.getId( ));
			existingEmployee.setName(updatedEmployee.getName());
			existingEmployee.setDesignation(updatedEmployee.getDesignation());
			return employeeRepo.save(existingEmployee);
			
		}
		return null;
	}
	
	@Override
	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
		
	}

	
}

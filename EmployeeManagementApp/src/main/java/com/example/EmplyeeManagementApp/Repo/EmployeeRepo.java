package com.example.EmplyeeManagementApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmplyeeManagementApp.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}

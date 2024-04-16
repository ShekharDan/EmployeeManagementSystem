package com.demo.employeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.employeeManagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

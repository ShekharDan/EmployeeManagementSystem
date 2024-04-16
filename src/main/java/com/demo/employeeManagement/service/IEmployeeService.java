package com.demo.employeeManagement.service;

import java.util.List;

import com.demo.employeeManagement.model.Employee;

public interface IEmployeeService {

    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(long id, Employee employeeUpdated);

    public boolean deleteEmployee(long id);

    public List<Employee> getAllEmployee();

    public Employee getEmployee(long id);

}

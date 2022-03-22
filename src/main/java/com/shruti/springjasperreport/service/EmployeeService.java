package com.shruti.springjasperreport.service;


import com.shruti.springjasperreport.dao.EmployeeDAO;
import com.shruti.springjasperreport.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;


    public List<Employee> getAllEmployee(){
        return employeeDAO.findAll();
    }

    public String saveEmployee(Employee employee) {
        employeeDAO.save(employee);
        return "record is saved";
    }

    public Optional<Employee> getEmployeeById(int empId) {
        return employeeDAO.findById(empId);
    }

}

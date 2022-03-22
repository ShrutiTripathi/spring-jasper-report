package com.shruti.springjasperreport.controller;


import com.shruti.springjasperreport.model.Employee;
import com.shruti.springjasperreport.service.EmployeeService;
import com.shruti.springjasperreport.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    ReportService reportService;

    @GetMapping("/allEmployees")
    public List<Employee> getAllEmployee(){
        return  employeeService.getAllEmployee();
    }

    @GetMapping("/getEmpById/{empId}")
    public Optional<Employee> getEmployeeInfoById(@PathVariable("empId") int empId){
        return employeeService.getEmployeeById(empId);
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/report/{format}")
    public String generateReport (@PathVariable String format) throws JRException, FileNotFoundException {
        return reportService.exportReport(format);}
}

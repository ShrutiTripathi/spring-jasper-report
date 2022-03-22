package com.shruti.springjasperreport.dao;

import com.shruti.springjasperreport.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeDAO extends MongoRepository<Employee,Integer> {


}

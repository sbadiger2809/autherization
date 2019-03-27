package com.example.demo.controller.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.lang.String;
import com.example.demo.controller.repositry.Employee;
import java.util.List;

@Repository
public interface EmployeeRepositry  extends MongoRepository<Employee, String>{
 
  Employee findByPid(String pid);
}

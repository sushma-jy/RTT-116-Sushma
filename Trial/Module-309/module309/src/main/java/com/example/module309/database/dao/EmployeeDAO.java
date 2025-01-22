package com.example.module309.database.dao;

import com.example.module309.database.entity.Customer;
import com.example.module309.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    // this is a JPA / Hibernate / HQL / JQL
    @Query("select e from Employee e where e.firstname = :firstName")
    List<Employee> findByFirstName(String firstName);

    Employee findById(Integer id);

    @Query(value = "select * from employees order by lastname asc;", nativeQuery = true)
    List<Employee> findAllEmployees();
}

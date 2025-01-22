package com.example.module309.database.dao;

import com.example.module309.database.entity.Product;
//import com.example.module309.database.entity.Customer;
//import com.example.module309.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface ProductDAO extends JpaRepository<Product, Long> {

Product findById(Integer id);

    List <Product> findByProductName(String productName);
}

package com.example.module309.controller;

//import com.example.module309.database.dao.CustomerDAO;
//import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.dao.ProductDAO;
//import com.example.module309.database.entity.Customer;
//import com.example.module309.database.entity.Employee;
import com.example.module309.database.entity.Product;
import com.example.module309.database.entity.User;
//import com.example.module309.form.CreateCustomerFormBean;
import com.example.module309.form.CreateProductFormBean;
import com.example.module309.security.AuthenticatedUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import jakarta.validation.Valid;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ProductController {
    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);
    private final ProductDAO productDAO;

    public ProductController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }


    @GetMapping("/Product/product")
    public ModelAndView createProduct() {
        ModelAndView response = new ModelAndView();
        response.setViewName("Product/product");

        return response;
    }
    @PostMapping("/Product/createProduct")
    public ModelAndView createProductSubmit(@Valid CreateProductFormBean form, BindingResult bindingResult) throws Exception {
        // this is called when the user clicks the submit button on the form
        ModelAndView response = new ModelAndView();


        response.setViewName("Product/product");

        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                //response.setViewName("Product/product");
                response.addObject("bindingResult", bindingResult);
                response.addObject("form", form);
            }
        }else{
            Product product = new Product();
            product.setProductCode(form.getProductCode());
            product.setProductName(form.getProductName());
            product.setProductlineId(form.getProductlineId());
            product.setProductScale(form.getProductScale());
            product.setProductVendor(form.getProductVendor());
            product.setProductDescription(form.getProductDescription());
            product.setQuantityInStock(form.getQuantityInStock());
            product.setBuyPrice(form.getBuyPrice());
            product.setMsrp(form.getMsrp());
            productDao.save(product);
        }


        return response;}

    @Autowired
    private ProductDAO productDao;

    @GetMapping("/Product/searchProduct")
    public ModelAndView search(@RequestParam(required = false) String productName) {
        ModelAndView response = new ModelAndView();


        response.setViewName("Product/searchProduct");

        response.addObject("search", productName);
        //Product product = productDao.findByProductName(productName);
        if (productName != null) {

            List<Product> products =productDao.findByProductName(productName);
            response.addObject("productKey", products);
        }

        return response;
    }
    @GetMapping("/Product/orderProduct/{id}")
    public ModelAndView orderProduct(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView();
        response.setViewName("Product/orderProduct");

        Product searchProduct=productDao.findById(id);

        List<Product> productList=new ArrayList<>();
        productList.add(searchProduct);



        response.addObject("productList",productList);
        return response;
    }

}

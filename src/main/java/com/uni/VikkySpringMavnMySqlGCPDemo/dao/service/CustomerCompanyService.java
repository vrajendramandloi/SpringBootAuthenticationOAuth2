package com.uni.VikkySpringMavnMySqlGCPDemo.dao.service;

import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.Customers;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.repository.CustomersCompanyRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerCompanyService {
    @Autowired
    private CustomersCompanyRespository customersCompanyRespository;

    public List<Customers> getAllCustomers() {
        List<Customers> records = new ArrayList<>();
        customersCompanyRespository.findAll().forEach(records::add);
        return records;
    }
}

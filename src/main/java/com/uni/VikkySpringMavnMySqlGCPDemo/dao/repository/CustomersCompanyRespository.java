package com.uni.VikkySpringMavnMySqlGCPDemo.dao.repository;

import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.Customers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomersCompanyRespository extends CrudRepository<Customers, Integer> {

    /*@Override
    @Query("SELECT CUSTOMER_ID, EMAIL_ADDRESS, FULL_NAME FROM CO.CUSTOMERS ")
    Iterable<Customers> findAll();*/
}

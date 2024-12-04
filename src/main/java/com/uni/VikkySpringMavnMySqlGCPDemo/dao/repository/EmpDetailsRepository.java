package com.uni.VikkySpringMavnMySqlGCPDemo.dao.repository;

import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.Customers;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.EmpDetails;
import org.springframework.data.repository.CrudRepository;

public interface EmpDetailsRepository extends CrudRepository<EmpDetails, Integer> {
}

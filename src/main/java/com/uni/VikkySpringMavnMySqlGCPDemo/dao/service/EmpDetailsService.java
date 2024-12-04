package com.uni.VikkySpringMavnMySqlGCPDemo.dao.service;

import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.Customers;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.EmpDetails;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.repository.EmpDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpDetailsService {
    @Autowired
    private EmpDetailsRepository empDetailsRepository;

    public List<EmpDetails> getAllEmpDetails () {
        List<EmpDetails> records = new ArrayList<>();
        empDetailsRepository.findAll().forEach(records::add);
        return records;
    }
}

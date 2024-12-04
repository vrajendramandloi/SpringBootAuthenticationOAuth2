package com.uni.VikkySpringMavnMySqlGCPDemo.controller;

import java.time.Instant;

import com.uni.VikkySpringMavnMySqlGCPDemo.dao.service.CustomerCompanyService;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.service.EmpDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	@Autowired
	private CustomerCompanyService customerCompanyService;

	@Autowired
	private EmpDetailsService empDetailsService;

	@GetMapping("/public/pingvicky")
	public String getCurrentTime() {
		return "Current Instant Vrajendra time"+Instant.now().toString();
	}

	@GetMapping("/public/getAllCompanyCustomers")
	public String getAllCompanyCustomers() {
		return customerCompanyService.getAllCustomers().toString();
	}

	@GetMapping("/getAllEmpDetails")
	public String getAllEmpDetails() {
		return empDetailsService.getAllEmpDetails().toString();
	}
}

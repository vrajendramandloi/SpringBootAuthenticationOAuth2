package com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "CUSTOMERS", schema = "CO")
public class Customers {
    @Id
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "FULL_NAME")
    private String fullName;

}

package com.boa.customerapi.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name="Customer")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="Account_No")
   @ApiModelProperty(hidden = true)
    private long accountNo;
   @Embedded
   //value object
    private FullName name;
    @Column(name="Email",nullable = false,length = 150)
    private String email;
    @Column(name="Password",nullable = false,length = 10)
    private String password;
    @Column(name="Contact_No")
    private long contactNo;

}

package com.sheth.springbootvalidation.entity;

import lombok.*;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
import javax.validation.constraints.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "employee")
public class Employee {

    //@Id
    //@GeneratedValue
    private int id;

    @NotNull(message = "FirstName is required!")
    @NotBlank(message = "Enter First Name!")
    private String firstName;

    @NotNull(message = "LastName is required!")
    @NotBlank(message = "Enter Last Name!")
    private String lastName;

    @NotNull(message = "Email is required!")
    @Email(message = "The email is not a valid email.")
    private String email;

    @NotNull(message = "Email is required!")
    @Min(value = 18, message = "The age must be equal or greater than 18")
    private int age;

    @NotNull(message = "Email is required!")
    @Past(message = "The Graduate date ")
    private Date dob;

    @NotNull
    @Size(min = 3, max = 15, message = "The username must be from 3 to 15 character")
    private String userName;

}

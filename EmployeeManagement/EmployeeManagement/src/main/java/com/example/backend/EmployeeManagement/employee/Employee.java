package com.example.backend.EmployeeManagement.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@Document (collection = "employees")
public class Employee {
	
	  private String username;
	    private String password;
	    private String firstName;
	    private String lastName;
	    private String role;
	    @Id private long id;
	    private boolean admin;

}

package com.covid.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
public class User {

	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer customerId;
	 
	 @NotNull(message = "User name  is madatory")
	 private String username;
	 
	 
	 private String mobileNumber;
	 
	 @NotNull(message = "Password is mandatory")
	 @Size(min = 8, max = 20)
	 private String password;
	 
	 
	 @Email
	 @NotNull(message = "Email is mandatory")
	 private String email;
}

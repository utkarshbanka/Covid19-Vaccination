package com.covid.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
public class Admin {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;
	
	@NotNull(message = "Admin username")
	private String adminname;
	
	@Column(unique = true)
	private String mobileNumber;
	
	@NotNull(message = "Password is Madatory")
	@Size(min = 8, max = 20)
	private String password;
	
	@Email
	@NotNull(message = "Email is mandatory")
	private String email;
	
	
}

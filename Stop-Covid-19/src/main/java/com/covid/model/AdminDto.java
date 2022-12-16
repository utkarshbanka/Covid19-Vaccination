package com.covid.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AdminDto {

	@Size(min = 9, max = 10,  message = "Pleas Enter valid mobile Number")
	@NotEmpty(message = "Mobile Number is  mandatory")
	@NotNull(message = "Mobile Number is mandatory")
	@Column(unique = true)
	private String mobileNumber;
	
	@NotNull(message = "Password is Mandatory")
	@Size(min = 8, max = 30)
	private String password;
}

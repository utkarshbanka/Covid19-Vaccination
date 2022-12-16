package com.covid.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {

	@Size(min = 9 ,max = 10, message = "Please Enter valid mobile no")
	@NotNull(message = "Mobile number is Mandatory")
	@NotEmpty(message = "Mobile number is mandatory")
	@Column(unique = true)
	private String mobileNumber;
	
	@NotNull
	@Size(min = 8,max = 20)
	private String password;
}

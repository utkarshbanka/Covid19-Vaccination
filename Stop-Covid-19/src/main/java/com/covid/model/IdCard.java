package com.covid.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull(message = "value is mandatory")
	@Size(min = 3, max = 20 , message = "name should be min 3 and max 5 character")
	private String name;
	private LocalDate dob;
	
	@NotNull(message = "value is mandatory")
	private String gender;
	
	@NotNull(message = "value is mandatory")
	@Size(min = 3, max = 25 , message = "value should be min 3 and max 5 character")
	private String address;
	
	@NotNull(message = "value is mandatory")
	private String city;
	
	@NotNull(message = "value is mandatory")
	private String state;
	
	@NotNull(message = "value is mandatory")
	private String pincode;

}

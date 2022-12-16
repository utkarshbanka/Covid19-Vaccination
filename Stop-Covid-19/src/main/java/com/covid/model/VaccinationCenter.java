package com.covid.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VaccinationCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer centerid;
	
	@NotNull(message = "name is mandatory")
	@Size(min = 3, max = 10 , message = "name should be min 3 and max 5 character")
	private String centername;
	
	@NotNull(message = "value is mandatory")
	@Size(min = 3, max = 25 , message = "value should be min 3 and max 5 character")
	private String address;
	
	@NotNull(message = "value is mandatory")
	private String city;
	
	@NotNull(message = "value is mandatory")
	private String state;
	
	@NotNull(message = "value is mandatory")
	private String pincode;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private VaccineInventory inventory;
	
}

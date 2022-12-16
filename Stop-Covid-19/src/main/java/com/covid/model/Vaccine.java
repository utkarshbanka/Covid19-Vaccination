package com.covid.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vaccine {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vaccineId;
	
	@NotNull(message = "value is mandatory")
	private String vaccineName;
	private String description;
}

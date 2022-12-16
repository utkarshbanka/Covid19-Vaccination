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
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingid;
	
	@NotNull(message = "value is mandatory")
	@Size(min = 10, max = 10 , message = "value should be min 10 and max 10 character")
	private long mobileno;
	private LocalDate dateofbooking;
	
	@NotNull(message = "value is mandatory")
	private Slot slot;
	private boolean bookingstatis;

}

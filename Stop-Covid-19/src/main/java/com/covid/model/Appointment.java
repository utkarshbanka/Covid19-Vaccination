package com.covid.model;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonEncoding;

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
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingid;
	
	@NotNull(message = "value is mandatory")
	@Size(min = 10, max = 10 , message = "value should be min 10 and max 10 character")
	private long mobileno;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dateofbooking;
	
	@NotNull(message = "value is mandatory")
	private Slot slot;
	private boolean bookingstatus;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Member member;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private VaccinationCenter vaccinationCenter;
}

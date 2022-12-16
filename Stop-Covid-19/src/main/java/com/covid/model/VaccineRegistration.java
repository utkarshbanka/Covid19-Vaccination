package com.covid.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccineRegistration {

	@Id
	@NotNull(message = "value is mandatory")
	private long mobileno;
	
	private LocalDate dateofregistration;
	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	private List<Member> memberlist;	
	
	
	
	
}

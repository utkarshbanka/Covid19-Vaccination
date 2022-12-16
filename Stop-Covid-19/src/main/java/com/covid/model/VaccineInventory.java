package com.covid.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class VaccineInventory {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer inventoryid;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,  pattern = "dd-MM-yyyy")
	@NotNull(message = "Date should not be Null")
	private LocalDate date;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "inventory")
	private List<VaccinationCenter> listofvacciantionCenter;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "inventory")
	private List<VaccineCount> vaccinecountnList;
}

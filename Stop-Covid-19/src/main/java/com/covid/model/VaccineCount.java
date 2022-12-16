package com.covid.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class VaccineCount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer vaccinecountId;
	
	
	private Integer quantity;
	private double price;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private VaccineInventory inventory;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	private Vaccine vaccine;
	
}

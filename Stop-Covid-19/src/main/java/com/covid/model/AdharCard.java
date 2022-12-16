package com.covid.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdharCard {
	
	@Id
	@NotNull(message = "Value is Mandatory")
	@Size(min = 12,max = 12)
	private long adharNo;
	
	@NotNull(message = "Value is Mandatory")
	private String fingerprints;
	
	private String irisscan;

}

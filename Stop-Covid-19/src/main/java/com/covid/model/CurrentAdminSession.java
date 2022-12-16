package com.covid.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
@ToString
public class CurrentAdminSession {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminLoginId;
	
	@NotNull(message = "Please Enter admin Id")
	private Integer adminId;
	
	@Column(unique = true)
	private String uuid;
	
	
	private LocalDate dateTime;
	
}

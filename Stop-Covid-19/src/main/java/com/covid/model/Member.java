package com.covid.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

	private boolean does1status;
	private boolean does2status;
	private LocalDate does1date;
	private LocalDate does2date;
	
}

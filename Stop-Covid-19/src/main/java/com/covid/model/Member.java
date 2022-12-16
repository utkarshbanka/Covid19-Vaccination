package com.covid.model;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

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
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer memberId;
	
	
	private boolean does1status;
	private boolean does2status;
	
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate does1date;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate does2date;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private IdCard idcard;
	
	
	@JsonIgnore
	@ManyToOne(cascade =CascadeType.ALL)
	private VaccineRegistration vaccineRegistration;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Vaccine vaccine;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "member")
	private List<Appointment> listofappoinments;
	
}

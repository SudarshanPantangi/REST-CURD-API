package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employee_table1")
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "studen_Id")
	private Integer studendId;

	@Column(name = "studen_Fname")
	private String studendFname;

	@Column(name = "studen_Lname")
	private String studendLname;

	@Column(name = "studen_Gander")
	private String studendGander;

	@JsonIgnore
	@Column(name = "studen_Address")
	private String studendAddress;

	@JsonIgnore
	@Column(name = "studen_Age")
	private Integer studendAge;
	
	@JsonIgnore
	@Column(name = "status")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EmployeeModel() {
	}

	public Integer getStudendId() {
		return studendId;
	}

	public void setStudendId(Integer studendId) {
		this.studendId = studendId;
	}

	public String getStudendFname() {
		return studendFname;
	}

	public void setStudendFname(String studendFname) {
		this.studendFname = studendFname;
	}

	public String getStudendLname() {
		return studendLname;
	}

	public void setStudendLname(String studendLname) {
		this.studendLname = studendLname;
	}

	public String getStudendGander() {
		return studendGander;
	}

	public void setStudendGander(String studendGander) {
		this.studendGander = studendGander;
	}

	public String getStudendAddress() {
		return studendAddress;
	}

	public void setStudendAddress(String studendAddress) {
		this.studendAddress = studendAddress;
	}

	public Integer getStudendAge() {
		return studendAge;
	}

	public void setStudendAge(Integer studendAge) {
		this.studendAge = studendAge;
	}
}

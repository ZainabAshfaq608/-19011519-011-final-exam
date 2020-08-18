package com.webservice.doctor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue
    @Column(name = "doc_id")
	private int DOC_ID;
    
    @Column(name = "doc_name")
	private String DOC_NAME;
    @Column(name = "doc_age")
	private int DOC_AGE;
    @Column(name = "doc_speciality")
	private String DOC_SPECIALITY;
    @Column(name = "doc_experience")
	private String DOC_EXPERIENCE;
	
	
	public int getDOC_ID() {
		return DOC_ID;
	}
	public void setDOC_ID(int dOC_ID) {
		DOC_ID = dOC_ID;
	}
	public String getDOC_NAME() {
		return DOC_NAME;
	}
	public void setDOC_NAME(String dOC_NAME) {
		DOC_NAME = dOC_NAME;
	}
	public int getDOC_AGE() {
		return DOC_AGE;
	}
	public void setDOC_AGE(int dOC_AGE) {
		DOC_AGE = dOC_AGE;
	}
	public String getDOC_SPECIALITY() {
		return DOC_SPECIALITY;
	}
	public void setDOC_SPECIALITY(String dOC_SPECIALITY) {
		DOC_SPECIALITY = dOC_SPECIALITY;
	}
	public String getDOC_EXPERIENCE() {
		return DOC_EXPERIENCE;
	}
	public void setDOC_EXPERIENCE(String dOC_EXPERIENCE) {
		DOC_EXPERIENCE = dOC_EXPERIENCE;
	}
	
	@Override
	public String toString() {
		return "Doctor [DOC_ID=" + DOC_ID + ", DOC_NAME=" + DOC_NAME + ", DOC_AGE=" + DOC_AGE + ", DOC_SPECIALITY="
				+ DOC_SPECIALITY + ", DOC_EXPERIENCE=" + DOC_EXPERIENCE + "]";
	}
	
}

package com.webservice.doctor.patiententity;

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
@Table(name = "patient")
public class Patient {
	@Id
    @GeneratedValue
    @Column(name = "patient_id")
	private int PATIENT_ID;
	@Column(name = "patient_name")
    private String PATIENT_NAME;
	@Column(name = "patient_gender")
	private String PATIENT_GENDER;
	@Column(name = "patient_doctor_name")
    private String PATIENT_DOCTOR_NAME;
	@Column(name = "patient_perscription")
    private String PATIENT_PERSCRIPTION; 
	@Column(name = "patient_disease")
    private String PATIENT_DISEASE;
	public int getPATIENT_ID() {
		return PATIENT_ID;
	}
	public void setPATIENT_ID(int pATIENT_ID) {
		PATIENT_ID = pATIENT_ID;
	}
	public String getPATIENT_NAME() {
		return PATIENT_NAME;
	}
	public void setPATIENT_NAME(String pATIENT_NAME) {
		PATIENT_NAME = pATIENT_NAME;
	}
	public String getPATIENT_GENDER() {
		return PATIENT_GENDER;
	}
	public void setPATIENT_GENDER(String pATIENT_GENDER) {
		PATIENT_GENDER = pATIENT_GENDER;
	}
	public String getPATIENT_DOCTOR_NAME() {
		return PATIENT_DOCTOR_NAME;
	}
	public void setPATIENT_DOCTOR_NAME(String pATIENT_DOCTOR_NAME) {
		PATIENT_DOCTOR_NAME = pATIENT_DOCTOR_NAME;
	}
	public String getPATIENT_PERSCRIPTION() {
		return PATIENT_PERSCRIPTION;
	}
	public void setPATIENT_PERSCRIPTION(String pATIENT_PERSCRIPTION) {
		PATIENT_PERSCRIPTION = pATIENT_PERSCRIPTION;
	}
	public String getPATIENT_DISEASE() {
		return PATIENT_DISEASE;
	}
	public void setPATIENT_DISEASE(String pATIENT_DISEASE) {
		PATIENT_DISEASE = pATIENT_DISEASE;
	}
	@Override
	public String toString() {
		return "Patient [PATIENT_ID=" + PATIENT_ID + ", PATIENT_NAME=" + PATIENT_NAME + ", PATIENT_GENDER="
				+ PATIENT_GENDER + ", PATIENT_DOCTOR_NAME=" + PATIENT_DOCTOR_NAME + ", PATIENT_PERSCRIPTION="
				+ PATIENT_PERSCRIPTION + ", PATIENT_DISEASE=" + PATIENT_DISEASE + "]";
	}

    

}

package com.webservice.doctor.patientrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.doctor.patiententity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

}

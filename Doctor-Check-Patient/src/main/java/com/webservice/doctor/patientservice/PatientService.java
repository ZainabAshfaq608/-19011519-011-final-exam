package com.webservice.doctor.patientservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.doctor.patiententity.Patient;
import com.webservice.doctor.patientrepository.PatientRepository;



@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient saveOne(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public List<Patient> saveMany(List<Patient> patients) {
		return patientRepository.saveAll(patients);
	}
	
	public List<Patient> getAll() {
		return patientRepository.findAll();
	}
	
	public Patient getOne(int id) {
		return patientRepository.findById(id).orElse(null);
	}
	public void deletePatient(int id) {
		patientRepository.deleteById(id); 
	}
	public Patient updatePatient(Patient patient) {
		Patient existingPatient = patientRepository.findById(patient.getPATIENT_ID()).orElse(null);
		existingPatient.setPATIENT_NAME(patient.getPATIENT_NAME());
		existingPatient.setPATIENT_GENDER(patient.getPATIENT_GENDER());
		existingPatient.setPATIENT_DOCTOR_NAME(patient.getPATIENT_DOCTOR_NAME());
		existingPatient.setPATIENT_PERSCRIPTION(patient.getPATIENT_PERSCRIPTION());
		existingPatient.setPATIENT_DISEASE(patient.getPATIENT_DISEASE());
		return patientRepository.save(existingPatient);
	}
}

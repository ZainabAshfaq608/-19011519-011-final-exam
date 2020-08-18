package com.webservice.doctor.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.doctor.entity.Doctor;
import com.webservice.doctor.repository.DoctorRepository;



@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;
	
	public Doctor saveOne(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	public List<Doctor> saveMany(List<Doctor> doctors) {
		return doctorRepository.saveAll(doctors);
	}
	
	public List<Doctor> getAll() {
		return doctorRepository.findAll();
	}
	
	public Doctor getOne(int id) {
		return doctorRepository.findById(id).orElse(null);
	}
	public void deleteDoctor(int id) {
		doctorRepository.deleteById(id); 
	}
	public Doctor updateDoctor(Doctor doctor) {
		Doctor existingDoctor = doctorRepository.findById(doctor.getDOC_ID()).orElse(null);
		existingDoctor.setDOC_NAME(doctor.getDOC_NAME());
		existingDoctor.setDOC_AGE(doctor.getDOC_AGE());
		existingDoctor.setDOC_SPECIALITY(doctor.getDOC_SPECIALITY());
		existingDoctor.setDOC_EXPERIENCE(doctor.getDOC_EXPERIENCE());
		return doctorRepository.save(existingDoctor);
	}

}



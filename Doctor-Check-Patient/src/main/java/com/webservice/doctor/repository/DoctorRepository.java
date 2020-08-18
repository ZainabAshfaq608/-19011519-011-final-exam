package com.webservice.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.doctor.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

	
}

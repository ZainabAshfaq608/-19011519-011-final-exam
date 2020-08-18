package com.webservice.doctor.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.doctor.entity.Doctor;
import com.webservice.doctor.service.DoctorService;



@RestController
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping("/doctor")
	public String inDoctor() {
		return "In Doctor Controller webservice project!!! ";
	}
	
	@PostMapping("/doctor/saveOne")
	public Doctor saveOne(@RequestBody Doctor doctor) {
		return doctorService.saveOne(doctor);
	}
	
	@PostMapping("/doctor/saveMany")
	public List<Doctor> saveMany(@RequestBody List<Doctor> doctors) {
		return doctorService.saveMany(doctors);
	}
	
	@GetMapping("/doctor/displayAllDoctors")
	public List<Doctor> getOneDoctor() {
		return doctorService.getAll();
	}
	
	@GetMapping("/doctor/displayOneDoctor/{id}")
	public Doctor getOneDoctor(@PathVariable int id) {
		return doctorService.getOne(id);
	}
	
	@DeleteMapping("/doctor/deleteOneDoctor/{id}")
	public String deleteOneDoctor(@PathVariable int id) {
		doctorService.deleteDoctor(id);
		return " Record with " + id + " is deleted!!!";
	}
	
	@PutMapping("/doctor/updateOneDoctor")
	public Doctor updateOneDoctor(@RequestBody  Doctor doctor) {
		return doctorService.saveOne(doctor);
	}
}


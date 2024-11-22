package com.patient.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.entity.Patient;
import com.patient.services.PatientService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;

	//get all patient list
	@GetMapping
	public List<Patient> getPatients() {
		return patientService.getAllPatients();
	}

	//get single patient 
	@GetMapping("/{patientId}")
	public Optional<Patient> getPatientById(@PathVariable String patientId) {
		return patientService.getPatientById(patientId);
	}

	//add patient
	@PostMapping("/register")
	public ResponseEntity<Patient> register(@RequestBody Patient patient) {
		
		Patient p1=patientService.savePatient(patient);
//		System.out.println("Added");
		return ResponseEntity.status(HttpStatus.CREATED).body(p1);
	}
	
	//remove patient
	@DeleteMapping("/{patientId}")
	public void removePatient(@PathVariable String patientId)
	{
		patientService.removePatient(patientId);
	}
	
	//update patient details
	@PutMapping("/{patientId}")
	public ResponseEntity<Patient> updatePatient(@PathVariable String patientId,@RequestBody Patient patient)
	{
		Patient p1=patientService.updatePatient(patientId, patient);
		return ResponseEntity.status(HttpStatus.OK).body(p1);
	}
	
	
//	@PostMapping("/login")
//	public void login(@RequestBody Patient patient)
//	{
//		patientService.verify(patient);
//		System.out.println("login successfull!!");
//	}
//	

}

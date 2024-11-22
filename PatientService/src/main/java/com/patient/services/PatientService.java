package com.patient.services;

import java.util.List;
import java.util.Optional;



import com.patient.entity.Patient;

public interface PatientService {

	// get all patients
	public List<Patient> getAllPatients();

	// get patient using id
	public Optional<Patient> getPatientById(String patientId);

	// add patient
	public Patient savePatient(Patient patient);

	// remove patient
	public void removePatient(String patientId);

	// update patient details
	public Patient updatePatient(String patientId, Patient updatedDetails);
	
//	public String verify(Patient patient);
//	
//	public Patient register(Patient patient);


}

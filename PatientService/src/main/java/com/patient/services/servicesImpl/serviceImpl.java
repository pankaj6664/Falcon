package com.patient.services.servicesImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.patient.entity.Patient;
import com.patient.repo.PatientRepo;
import com.patient.services.PatientService;


@Service
public class serviceImpl implements PatientService {

	@Autowired
	private PatientRepo patientRepo;
	
//	@Autowired
//	AuthenticationManager authManager;
//	
//	@Autowired
//    private PasswordEncoder passwordEncoder;
	

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

	@Override
	public Optional<Patient> getPatientById(String patientId) {
		// TODO Auto-generated method stub
		return patientRepo.findById(patientId);
	}

	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		String id = UUID.randomUUID().toString();
		patient.setPatientId(id);
		return patientRepo.save(patient);
	}

	@Override
	public void removePatient(String patientId) {
		// TODO Auto-generated method stub
		patientRepo.deleteById(patientId);

	}

	@Override
	public Patient updatePatient(String patientId, Patient updatedDetails) {
		// TODO Auto-generated method stub

		Patient existingP = patientRepo.getById(patientId);
		existingP.setName(updatedDetails.getName());
		existingP.setEmail(updatedDetails.getEmail());
		existingP.setContact(updatedDetails.getContact());
		existingP.setAddress(updatedDetails.getAddress());

		return patientRepo.save(existingP);

	}



//	@Override
//	public String verify(Patient patient) {
//		Authentication authenication=authManager.authenticate(new UsernamePasswordAuthenticationToken(patient.getName(), patient.getPassword()));
//	
//		System.out.println(authenication);
//		
//		if(authenication.isAuthenticated()) 
//			return "true";
//		return "Fail";
//	}
//
//	@Override
//	public Patient register(Patient patient) {
//		patient.setPassword(passwordEncoder.encode(patient.getPassword()));
//		return patientRepo.save(patient);
//		
//	}


}

package com.Practo.Practo.services;

import com.Practo.Practo.entities.Patient;
import com.Practo.Practo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient createPatient(Patient patient){
        Patient savedPatient = patientRepository.save(patient);
        return patient;
    }

}

package com.Practo.Practo.controller;

import com.Practo.Practo.entities.Doctor;
import com.Practo.Practo.entities.Patient;
import com.Practo.Practo.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/add")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        Patient createdPatient = patientService.createPatient(patient); // Use the service to create a patient
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient); // Return the created patient
    }
}

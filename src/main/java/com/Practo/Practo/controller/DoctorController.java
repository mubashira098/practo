package com.Practo.Practo.controller;

import com.Practo.Practo.entities.Doctor;
import com.Practo.Practo.services.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping("/add")
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor) {
        Doctor createdDoctor = doctorService.createDoctor(doctor);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDoctor);
    }
    //http://localhost:8081/doctors/search?search=Cardiology

    @GetMapping("/search")
    public ResponseEntity<List<Doctor>> searchDoctors(@RequestParam String search) {
        List<Doctor> doctors = doctorService.searchDoctorByNameOrSpecialization(search);
        return ResponseEntity.ok(doctors); // Return a ResponseEntity with the list of doctors
    }

    // Other methods (like getAllDoctors, getDoctorById, deleteDoctor) can go here
}


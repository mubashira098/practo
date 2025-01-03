package com.Practo.Practo.services;

import com.Practo.Practo.entities.Doctor;
import com.Practo.Practo.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    // Method to create a new doctor
    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Method to search doctors by name or specialization
    public List<Doctor> searchDoctorByNameOrSpecialization(String search) {
        return doctorRepository.searchByNameOrSpecialization(search);
    }

    // Method to get all doctors
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // Method to get a doctor by ID
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    // Method to delete a doctor by ID
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}

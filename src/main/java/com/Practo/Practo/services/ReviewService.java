package com.Practo.Practo.services;

import com.Practo.Practo.entities.Doctor;
import com.Practo.Practo.entities.Patient;
import com.Practo.Practo.entities.Review;
import com.Practo.Practo.repository.DoctorRepository;
import com.Practo.Practo.repository.PatientRepository;
import com.Practo.Practo.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository; // Added PatientRepository

    @Autowired
    private ReviewRepository reviewRepository;

    public Review createReview(Review review) {
        Optional<Doctor> doctorOpt = doctorRepository.findById(review.getDoctorId());
        Optional<Patient> patientOpt = patientRepository.findById(review.getPatientId());

        if (doctorOpt.isPresent() && patientOpt.isPresent()) { // Check if both doctor and patient exist

            Review save = reviewRepository.save(review);// Save the review and return it
            System.out.println("error while saving");
            return save;
        } else {
            return null; // Return null if doctor or patient does not exist
        }
    }

    public List<Review> getReviewByDoctorId(long doctorId) {
        return reviewRepository.findByDoctorId(doctorId); // Fetch reviews by doctor ID
    }
}

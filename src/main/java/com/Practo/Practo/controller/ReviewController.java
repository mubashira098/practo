package com.Practo.Practo.controller;

import com.Practo.Practo.entities.Review;
import com.Practo.Practo.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    /**
     * Creates a new review for a doctor.
     *
     * @param review The review object to be created (with doctorId, patientId, and rating).
     * @return The created review.
     */
    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Review review) {
        try {
            // Ensure the rating is valid before creating the review
            Review createdReview = reviewService.createReview(review);
            return new ResponseEntity<>(createdReview, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new Review()); // Empty review to indicate failure
        }
    }

    /**
     * Fetch reviews by doctor ID.
     *
     * @param doctorId The ID of the doctor.
     * @return A list of reviews for the doctor.
     */
    @GetMapping("/doctor/{doctorId}")
    public ResponseEntity<List<Review>> getReviewsByDoctorId(@PathVariable long doctorId) {
        List<Review> reviews = reviewService.getReviewByDoctorId(doctorId);  // Use the correct method name
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }

    // Other endpoints for creating reviews or calculating average ratings can be added similarly.
}

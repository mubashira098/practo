package com.Practo.Practo.payload;

import com.Practo.Practo.entities.Doctor;
import com.Practo.Practo.entities.Review;
import lombok.Data;

import java.util.List;

@Data
public class DoctorDto {
    private Doctor doctor;
    private List<Review> reviews;
    private double ratingPercentage;
}

package com.Practo.Practo.repository;

import com.Practo.Practo.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {

    List<Review>findByDoctorId(long id);
}

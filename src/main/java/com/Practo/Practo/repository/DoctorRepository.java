package com.Practo.Practo.repository;

import com.Practo.Practo.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    // Assuming you're using a custom query with @Query
    @Query("SELECT d FROM Doctor d WHERE d.name LIKE %:searchTerm% OR d.specialization LIKE %:searchTerm%")
    public List<Doctor> searchByNameOrSpecialization(@Param("searchTerm") String searchTerm);
}

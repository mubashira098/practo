package com.Practo.Practo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique identifier for the doctor

    @Column(nullable = false)
    private String name; // Doctor's name

    @Column(nullable = false)
    private String qualification; // Doctor's qualifications

    @Column(nullable = false)
    private String specialization; // Doctor's area of specialization

    private int experience; // Years of experience

    private String description; // Additional details about the doctor

    // Default constructor
    public Doctor() {
    }

    // Parameterized constructor
    public Doctor(String name, String qualification, String specialization, int experience, String description) {
        this.name = name;
        this.qualification = qualification;
        this.specialization = specialization;
        this.experience = experience;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

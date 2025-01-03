package com.Practo.Practo.entities;

import javax.persistence.*;

@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String age;
    private String diseases;

// Getters and Setters
public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getAge() {
    return age;
}

public void setAge(String age) {
    this.age = age;
}

public String getDiseases() {
    return diseases;
}

public void setDiseases(String diseases) {
    this.diseases = diseases;
}
}


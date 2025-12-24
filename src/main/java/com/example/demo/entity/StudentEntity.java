package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public StudentEntity(Long id, String name, String email, float cgpa) {
       
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public StudentEntity() {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return this.cgpa;
    }
}




MUTHUSAMY
PONGIYAMMAL
DHARANEESH
SUBRAMANI
SARASWATHI
PAPPATHI
KULANDHAI VEL
LOGA PRIYA
THEJA SRI
DEV AADHIRAN
PONGIYANNAN
THANGAMANI
NAVINDRA
VIKAS
TAMILARASI
SANDHIYA



KISHORE KUMAR <3 SOWMIYA

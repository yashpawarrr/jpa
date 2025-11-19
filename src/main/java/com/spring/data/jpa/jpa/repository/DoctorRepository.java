package com.spring.data.jpa.jpa.repository;

import com.spring.data.jpa.jpa.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
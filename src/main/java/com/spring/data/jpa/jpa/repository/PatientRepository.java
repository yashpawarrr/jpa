package com.spring.data.jpa.jpa.repository;

import com.spring.data.jpa.jpa.dto.BloodGroupCountResponseEntity;
import com.spring.data.jpa.jpa.entity.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByName(String name);

//    @Query("select p from Patient where p.bloodGroup = ?1")
//    List<Patient> findByBloodGroup(String bloodGroup);

}


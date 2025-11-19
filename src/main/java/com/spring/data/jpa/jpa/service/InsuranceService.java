package com.spring.data.jpa.jpa.service;

import com.spring.data.jpa.jpa.entity.Insurance;
import com.spring.data.jpa.jpa.entity.Patient;
import com.spring.data.jpa.jpa.repository.InsuranceRepository;
import com.spring.data.jpa.jpa.repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    @Autowired
    private InsuranceRepository insuranceRepository;
    @Autowired
    private PatientRepository patientRepository;

    @Transactional
    public Patient assignInsuranceToPatient(Insurance insurance, Long patientId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new EntityNotFoundException("Patient not fount with id: " + patientId));

//        patient.setInsurance(insurance);
        patient.setInsurance(insurance);

        insurance.setPatient(patient);
//        insurance.setPatient(patient); // FOR MAINTAINING "BI-DIRECTIONALITY" >>>

        return patient;
    }
}

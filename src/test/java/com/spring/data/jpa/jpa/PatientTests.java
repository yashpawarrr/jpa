package com.spring.data.jpa.jpa;

import com.spring.data.jpa.jpa.dto.BloodGroupCountResponseEntity;
import com.spring.data.jpa.jpa.entity.Patient;
import com.spring.data.jpa.jpa.repository.PatientRepository;
import com.spring.data.jpa.jpa.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.w3c.dom.stylesheets.LinkStyle;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository() {
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);

        Patient p1 = new Patient();
        patientRepository.save(p1);
    }

    @Test
    public void testTransactionMethods() {

//        List<Patient> patientList = patientRepository.findByBornAfterDate(LocalDate.of(1900, 3, 15));
//        for (Patient p : patientList) {
//            System.out.println(p);
//        }

//        List<BloodGroupCountResponseEntity> bloodGroupList = patientRepository.countEachBloodGroupType();
//        for (BloodGroupCountResponseEntity bloodGroupCountResponseEntity : bloodGroupList) {
//            System.out.println(bloodGroupCountResponseEntity);
//        }

//        Page<Patient> patientPage = patientRepository.findAllPatients(PageRequest.of(0, 2));
//
//        for (Patient patient : patientPage) {
//
//            System.out.println(patient);
//        }
//    }
}

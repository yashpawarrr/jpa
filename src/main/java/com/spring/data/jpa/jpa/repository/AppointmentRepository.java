package com.spring.data.jpa.jpa.repository;

import com.spring.data.jpa.jpa.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
package com.spring.data.jpa.jpa.repository;

import com.spring.data.jpa.jpa.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}
package com.helthcaremanagementsystem.repository;

import com.helthcaremanagementsystem.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository  extends JpaRepository<patient,Long>{

}

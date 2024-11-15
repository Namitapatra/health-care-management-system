package com.helthcaremanagementsystem.doclogin.repository;

import com.helthcaremanagementsystem.doclogin.enity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointment, Long> {
}

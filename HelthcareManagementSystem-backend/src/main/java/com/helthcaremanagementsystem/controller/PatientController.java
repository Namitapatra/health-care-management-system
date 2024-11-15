package com.helthcaremanagementsystem.controller;

import com.helthcaremanagementsystem.entity.patient;
import com.helthcaremanagementsystem.repository.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/api/v1"))
public class PatientController {

   private PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        super();
        this.patientRepository = patientRepository;
    }

    @PostMapping(("/insert"))
    public patient createPatient(@RequestBody patient patient) {

       return patientRepository.save(patient);

    }
     @GetMapping
    public List<patient> getAllPatients() {
        return patientRepository.findAll();
    }
}

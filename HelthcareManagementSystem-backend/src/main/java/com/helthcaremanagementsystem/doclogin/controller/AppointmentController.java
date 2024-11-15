package com.helthcaremanagementsystem.doclogin.controller;

import com.helthcaremanagementsystem.doclogin.enity.Appointment;
import com.helthcaremanagementsystem.doclogin.repository.AppointmentsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/api/v2"))
public class AppointmentController {

    AppointmentsRepository appointmentsRepository;

    public AppointmentController(AppointmentsRepository appointmentsRepository) {
        super();
        this.appointmentsRepository = appointmentsRepository;
    }

    @PostMapping(("/insert"))
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentsRepository.save(appointment);
    }

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentsRepository.findAll();
    }

}

package com.helthcaremanagementsystem.doclogin.controller;

import com.helthcaremanagementsystem.doclogin.enity.Medicine;
import com.helthcaremanagementsystem.doclogin.repository.MedicineRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/api/v3"))
public class MedicineController {

    MedicineRepository medicineRepository;

    public MedicineController(MedicineRepository medicineRepository) {
        super();
        this.medicineRepository = medicineRepository;
    }

    @PostMapping(("/insert"))
    public Medicine createMedicine(@RequestBody Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @GetMapping
    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }
}

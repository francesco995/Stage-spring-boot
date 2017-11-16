package com.objectway.stage.service;


import com.objectway.stage.model.Patient;
import com.objectway.stage.repository.PatientRepository;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;


public class PatientService {


    private PatientRepository patientRepository;

    @Transactional
    public Set<Patient> getAllPatients() {

        Set<Patient> patients = new HashSet<>();

        patientRepository.findAll().iterator().forEachRemaining(p -> patients.add(p));

        return patients;
    }


    public PatientService patientRepository(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
        return this;
    }
}

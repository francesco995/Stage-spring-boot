package com.objectway.stage.service;

import com.objectway.stage.model.Nurse;
import com.objectway.stage.repository.NurseRepository;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;


public class NurseService {

    private NurseRepository nurseRepository;


    @Transactional
    public Set<Nurse> getAllNourses() {

        Set<Nurse> nurses = new HashSet<>();

        nurseRepository.findAll().iterator().forEachRemaining(n -> nurses.add(n));

        return nurses;
    }

    public NurseService nurseRepository(NurseRepository nurseRepository) {
        this.nurseRepository = nurseRepository;
        return this;
    }





}

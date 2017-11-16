package com.objectway.stage.service;

import com.objectway.stage.model.Physician;
import com.objectway.stage.repository.PhysicianRepository;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PhysicianService {

    private PhysicianRepository physicianRepository;





    @Transactional
    public Set<Physician> getAllPhysicians(){

        Set<Physician> physicians = new HashSet<>();

        Iterable<Physician> physicianIterable = physicianRepository.findAll();

        Iterator<Physician> physicianIterator = physicianIterable.iterator();

        physicianIterator.forEachRemaining(p -> physicians.add(p));

        return physicians;
    }


    public PhysicianService physicianRepository(PhysicianRepository physicianRepository) {
        this.physicianRepository = physicianRepository;
        return this;
    }
}

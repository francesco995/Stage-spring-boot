package com.objectway.stage.repository;

import com.objectway.stage.model.Physician;
import org.springframework.data.repository.CrudRepository;

public interface PhysicianRepository extends CrudRepository<Physician, Long> {
}

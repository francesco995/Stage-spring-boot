package com.objectway.stage.repository;

import com.objectway.stage.model.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
}

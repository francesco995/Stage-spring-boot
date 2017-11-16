package com.objectway.stage.service;

import com.objectway.stage.model.Appointment;
import com.objectway.stage.repository.AppointmentRepository;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

public class AppointmentService {

    private AppointmentRepository appointmentRepository;


    @Transactional
    public Set<Appointment> getAllAppointments() {

        Set<Appointment> appointments = new HashSet<>();

        appointmentRepository.findAll().iterator().forEachRemaining(a -> appointments.add(a));

        return appointments;
    }

    public void setAppointmentRepository(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }


    public AppointmentService appointmentRepository(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
        return this;
    }
}




package com.objectway.stage.configuration;


import com.objectway.stage.repository.AppointmentRepository;
import com.objectway.stage.repository.NurseRepository;
import com.objectway.stage.repository.PatientRepository;
import com.objectway.stage.repository.PhysicianRepository;
import com.objectway.stage.service.AppointmentService;
import com.objectway.stage.service.NurseService;
import com.objectway.stage.service.PatientService;
import com.objectway.stage.service.PhysicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfigurator {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private NurseRepository nurseRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PhysicianRepository physicianRepository;



    @Bean
    public AppointmentService appointmentService() {
        return new AppointmentService().appointmentRepository(appointmentRepository);
    }

    @Bean
    public NurseService nurseService() {
        return new NurseService().nurseRepository(nurseRepository);
    }

    @Bean
    public PatientService patientService() {
        return new PatientService().patientRepository(patientRepository);
    }

    @Bean
    public PhysicianService physicianService() {
        return new PhysicianService().physicianRepository(physicianRepository);
    }


}

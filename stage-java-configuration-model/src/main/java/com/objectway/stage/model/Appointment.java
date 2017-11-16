package com.objectway.stage.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Appointment")
public class Appointment {

    @Id
    @Column(name="AppointmentID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "Patient")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "PrepNurse")
    private Nurse prepNurse;

    @ManyToOne
    @JoinColumn(name = "Physician")
    private Physician physician;

    @Column(name = "Start")
    private Date start;

    @Column(name = "End")
    private Date end;

    @Column(name = "ExaminationRoom")
    private String examinationRoom;


    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patient=" + patient +
                ", prepNurse=" + prepNurse +
                ", physician=" + physician +
                ", start=" + start +
                ", end=" + end +
                ", examinationRoom='" + examinationRoom + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Nurse getPrepNurse() {
        return prepNurse;
    }

    public void setPrepNurse(Nurse prepNurse) {
        this.prepNurse = prepNurse;
    }

    public Physician getPhysician() {
        return physician;
    }

    public void setPhysician(Physician physician) {
        this.physician = physician;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getExaminationRoom() {
        return examinationRoom;
    }

    public void setExaminationRoom(String examinationRoom) {
        this.examinationRoom = examinationRoom;
    }
}

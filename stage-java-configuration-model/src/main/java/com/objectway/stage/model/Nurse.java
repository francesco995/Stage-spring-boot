package com.objectway.stage.model;


import javax.persistence.*;

@Entity
@Table(name = "Nurse")
public class Nurse {

    @Id
    @Column(name="EmployeeID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Position")
    private String position;

    @Column(name = "Registered")
    private Boolean registered;

    @Column(name = "SSN")
    private Long ssn;


    @Override
    public String toString() {
        return "Nurse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", registered=" + registered +
                ", ssn=" + ssn +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }
}

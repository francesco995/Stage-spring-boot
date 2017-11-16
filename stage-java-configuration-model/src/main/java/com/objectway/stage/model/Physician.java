package com.objectway.stage.model;


import javax.persistence.*;

@Entity
@Table(name="Physician")
public class Physician {

    @Id
    @Column(name="EmployeeID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="Name")
    private String name;

    @Column(name="Position")
    private String position;

    @Column(name="SSN")
    private Long ssn;




    @Override
    public String toString() {
        return "Physician{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
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

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }
}

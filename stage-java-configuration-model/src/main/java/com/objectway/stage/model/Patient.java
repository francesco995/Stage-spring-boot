package com.objectway.stage.model;


import javax.persistence.*;

@Entity
@Table(name="Patient")
public class Patient {

    @Id
    @Column(name="SSN")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="Name")
    private String name;

    @Column(name="Address")
    private String address;

    @Column(name="Phone")
    private String phone;

    @Column(name="InsuranceID")
    private Long insuranceId;

    @ManyToOne
    @JoinColumn(name = "PCP")
    private Physician pcp;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", insuranceId=" + insuranceId +
                ", pcp=" + pcp +
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Long insuranceId) {
        this.insuranceId = insuranceId;
    }

    public Physician getPcp() {
        return pcp;
    }

    public void setPcp(Physician pcp) {
        this.pcp = pcp;
    }
}

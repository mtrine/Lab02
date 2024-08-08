package com.example.lab02.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ContactInformation")
public class ContactInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="personal_phone")
    private String personalPhone;

    @Column(name="home_phone")
    private String homePhone;

    @Column(name="email")
    private String email;

    @Column(name="permanent_address")
    private String permanentAddress;

    @Column(name="city_permanent_address")
    private String cityPermanentAddress;

    @Column(name="district_permanent_address")
    private String districtPermanentAddress;

    @Column(name="ward_permanent_address")
    private String wardPermanentAddress;

    @Column(name="temporary_address")
    private String temporaryAddress;

    @Column(name="city_temporary_address")
    private String cityTemporaryAddress;

    @Column(name="district_temporary_address")
    private String districtTemporaryAddress;

    @Column(name="ward_temporary_address")
    private String wardTemporaryAddress;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    public void setTemporaryAddress(String temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }

    public String getCityPermanentAddress() {
        return cityPermanentAddress;
    }

    public void setCityPermanentAddress(String cityPermanentAddress) {
        this.cityPermanentAddress = cityPermanentAddress;
    }

    public String getDistrictPermanentAddress() {
        return districtPermanentAddress;
    }

    public void setDistrictPermanentAddress(String districtPermanentAddress) {
        this.districtPermanentAddress = districtPermanentAddress;
    }

    public String getWardPermanentAddress() {
        return wardPermanentAddress;
    }

    public void setWardPermanentAddress(String wardPermanentAddress) {
        this.wardPermanentAddress = wardPermanentAddress;
    }

    public String getWardTemporaryAddress() {
        return wardTemporaryAddress;
    }

    public void setWardTemporaryAddress(String wardTemporaryAddress) {
        this.wardTemporaryAddress = wardTemporaryAddress;
    }

    public String getDistrictTemporaryAddress() {
        return districtTemporaryAddress;
    }

    public void setDistrictTemporaryAddress(String districtTemporaryAddress) {
        this.districtTemporaryAddress = districtTemporaryAddress;
    }

    public String getCityTemporaryAddress() {
        return cityTemporaryAddress;
    }

    public void setCityTemporaryAddress(String cityTemporaryAddress) {
        this.cityTemporaryAddress = cityTemporaryAddress;
    }
}

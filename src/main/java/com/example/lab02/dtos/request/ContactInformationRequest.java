package com.example.lab02.dtos.request;

public class ContactInformationRequest {
    private String personalPhone;
    private String homePhone;
    private String email;
    private String permanentAddress;
    private String cityPermanentAddress;
    private String districtPermanentAddress;
    private String wardPermanentAddress;
    private String temporaryAddress;
    private String cityTemporaryAddress;
    private String districtTemporaryAddress;
    private String wardTemporaryAddress;

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

    public String getWardPermanentAddress() {
        return wardPermanentAddress;
    }

    public void setWardPermanentAddress(String wardPermanentAddress) {
        this.wardPermanentAddress = wardPermanentAddress;
    }

    public String getDistrictPermanentAddress() {
        return districtPermanentAddress;
    }

    public void setDistrictPermanentAddress(String districtPermanentAddress) {
        this.districtPermanentAddress = districtPermanentAddress;
    }

    public String getCityPermanentAddress() {
        return cityPermanentAddress;
    }

    public void setCityPermanentAddress(String cityPermanentAddress) {
        this.cityPermanentAddress = cityPermanentAddress;
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
}

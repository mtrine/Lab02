package com.example.lab02.dtos.request;

import java.util.Date;
public class AspirationRequest {
    private double desiredSalary;
    private Date desiredStartDate;
    private String desiredWorkplace;
    private String otherRequest;

    public double getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(double desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public String getOtherRequest() {
        return otherRequest;
    }

    public void setOtherRequest(String otherRequest) {
        this.otherRequest = otherRequest;
    }

    public String getDesiredWorkplace() {
        return desiredWorkplace;
    }

    public void setDesiredWorkplace(String desiredWorkplace) {
        this.desiredWorkplace = desiredWorkplace;
    }

    public Date getDesiredStartDate() {
        return desiredStartDate;
    }

    public void setDesiredStartDate(Date desiredStartDate) {
        this.desiredStartDate = desiredStartDate;
    }
}

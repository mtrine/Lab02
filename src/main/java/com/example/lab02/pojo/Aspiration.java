package com.example.lab02.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Aspiration")
public class Aspiration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="desired_salary")
    private double desiredSalary;

    @Column(name="desired_start_date")
    private Date desiredStartDate;

    @Column(name="desired_workplace")
    private String desiredWorkplace;

    @Column(name="other_request")
    private String otherRequest;

    public double getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(double desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public Date getDesiredStartDate() {
        return desiredStartDate;
    }

    public void setDesiredStartDate(Date desiredStartDate) {
        this.desiredStartDate = desiredStartDate;
    }

    public String getOrderRequest() {
        return otherRequest;
    }

    public void setOrderRequest(String orderRequest) {
        this.otherRequest = otherRequest;
    }

    public String getDesiredWorkplace() {
        return desiredWorkplace;
    }

    public void setDesiredWorkplace(String desiredWorkplace) {
        this.desiredWorkplace = desiredWorkplace;
    }
}

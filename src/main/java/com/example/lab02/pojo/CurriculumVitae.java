package com.example.lab02.pojo;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "curriculum_vitae")
public class CurriculumVitae {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "position_applied")
    private String positionApplied;

    @Column(name = "gender")
    private String gender;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "ethnicity")
    private String ethnicity;

    @Column(name = "religion")
    private String religion;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "birth_place")
    private String birthPlace;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "id_type")
    private String idType;

    @Column(name = "id_issue_date")
    private Date idIssueDate;

    @Column(name = "id_issue_place")
    private String idIssuePlace;

    @Column(name = "id_expiry_date")
    private Date idExpiryDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPositionApplied() {
        return positionApplied;
    }

    public void setPositionApplied(String positionApplied) {
        this.positionApplied = positionApplied;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public Date getIdIssueDate() {
        return idIssueDate;
    }

    public void setIdIssueDate(Date idIssueDate) {
        this.idIssueDate = idIssueDate;
    }

    public String getIdIssuePlace() {
        return idIssuePlace;
    }

    public void setIdIssuePlace(String idIssuePlace) {
        this.idIssuePlace = idIssuePlace;
    }

    public Date getIdExpiryDate() {
        return idExpiryDate;
    }

    public void setIdExpiryDate(Date idExpiryDate) {
        this.idExpiryDate = idExpiryDate;
    }
}

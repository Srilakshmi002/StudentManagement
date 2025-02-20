package com.example.entity;

import com.mysql.cj.protocol.ColumnDefinition;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Student")
public class StudentEntity {

    @Id
   /* @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(columnDefinition = "BIGINT CHECK (studentID>=1000000000 AND studentID<=9999999999)")*/
    private Long studentID;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column
    private Long phoneNumber;
    private Date dateOfBirth;

    public StudentEntity(){

    }
    public StudentEntity(String firstName, String lastName, String email, Long phoneNumber, Date dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Course")
public class CourseEntity {

    @Id
    @Column(nullable = false,unique = true)
    private String coursecode;

    @Column
    private String coursename;

    @Column
    private String section;

    @Column
    private String professor;

    @Column
    private Date meetingStartDate;

    @Column
    private Date meetingEndDate;


    public CourseEntity(){

    }
    public CourseEntity(String coursecode, String coursename, String section, String professor, Date meetingStartDate, Date meetingEndDate){
        this.coursecode = coursecode;
        this.coursename = coursename;
        this.section = section;
        this.professor = professor;
        this.meetingStartDate = meetingStartDate;
        this.meetingEndDate = meetingEndDate;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Date getMeetingStartDate() {
        return meetingStartDate;
    }

    public void setMeetingStartDate(Date meetingStartDate) {
        this.meetingStartDate = meetingStartDate;
    }

    public Date getMeetingEndDate() {
        return meetingEndDate;
    }

    public void setMeetingEndDate(Date meetingEndDate) {
        this.meetingEndDate = meetingEndDate;
    }
}

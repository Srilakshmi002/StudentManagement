package com.example.service;

import com.example.entity.CourseEntity;
import com.example.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courserepository;

    //List of all courses available
    public List<CourseEntity> getAllCourses(){
        return courserepository.findAll();
    }

    //Retrieving all courses taught by professor
    public ArrayList<String> findCoursesByProfessor(String professor){
        List<CourseEntity> courseinfo = courserepository.findAll();
        ArrayList<String> coursesList = new java.util.ArrayList<>();
        for (CourseEntity courses : courseinfo){
            if (courses.getProfessor() == professor){
                coursesList.add(courses.getCoursename());
            }
        }
        return coursesList;
    }

    //Retrieving courses between two given Dates
    public ArrayList<String> findCoursesByDate(Date meetingStartDate, Date meetingEndDate){
        List<CourseEntity> courses = courserepository.findAll();
        ArrayList<String> coursesList = new java.util.ArrayList<>();
        for (CourseEntity courseinfo : courses){
            if (courseinfo.getMeetingStartDate() == meetingStartDate && courseinfo.getMeetingEndDate() == meetingEndDate){
                coursesList.add(courseinfo.getCoursename());
            }
        }
        return coursesList;
    }




}

package com.example.controller;

import com.example.entity.CourseEntity;
import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping
    public List<CourseEntity> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{professor}")
    public List<String> getCourses(@PathVariable String professor){
        return courseService.findCoursesByProfessor(professor);
    }

    @GetMapping("/{meetingStartDate}/{meetingEndDate}")
    public List<String> getCourseByDate(@PathVariable  Date meetingStartDate, @PathVariable Date meetingEndDate){
        return courseService.findCoursesByDate(meetingStartDate, meetingEndDate);
    }
}

package com.example.controller;

import com.example.entity.StudentEntity;
import com.example.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping
    public List<StudentEntity> getAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("/{studentID}")
    public StudentEntity studentinfo(@PathVariable  Long studentID){
        return studentService.getStudentsByStudentID(studentID);
    }


    @PostMapping
    public String createUser(@RequestBody StudentEntity details){
        return studentService.saveInfo(details);
    }

    @GetMapping("/name/{studentID}")
    public List<String> returnnames(@PathVariable Long studentID){
        return studentService.getName(studentID);
    }

    @PutMapping("/{studentID}")
    public String updateStudent(@PathVariable Long studentID, @RequestBody StudentEntity fields){
        return studentService.updatePhoneNumber(studentID, fields);
    }




}

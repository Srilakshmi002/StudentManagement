package com.example.service;

import com.example.entity.StudentEntity;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService{

    @Autowired
    private StudentRepository studentRepository;


    public StudentEntity getStudentsByStudentID(long studentID){
        List<StudentEntity> studentinfo = studentRepository.findAll();
        for (StudentEntity student : studentinfo){
            if (student.getStudentID() == studentID){
                return student;
            }
        }
        return null;
    }

    public List<StudentEntity> findAllStudents(){
        return studentRepository.findAll();
    }

    public String saveInfo(StudentEntity student){
        studentRepository.save(student);
        return "Data saved successfully!!";
    }

    public ArrayList<String> getName(long studentID){
               List<StudentEntity> studentname = studentRepository.findAll();
               for (StudentEntity student : studentname){
                   if (student.getStudentID() == studentID){
                       ArrayList<String> names = new java.util.ArrayList<>();
                       names.add(student.getFirstName());
                       names.add(student.getLastName());
                       return names;
                   }
               }
               return null;
    }

    public String updatePhoneNumber(Long studentID, StudentEntity fields ){
        StudentEntity updateinfo = getStudentsByStudentID(studentID);
        if (fields.getFirstName()!=null){
            updateinfo.setFirstName(fields.getFirstName());
        }
        if (fields.getLastName()!=null){
            updateinfo.setLastName(fields.getLastName());
        }
        if (fields.getEmail()!=null){
            updateinfo.setEmail(fields.getEmail());
        }
        if (fields.getPhoneNumber()!=null){
            updateinfo.setPhoneNumber(fields.getPhoneNumber());
        }
        studentRepository.save(updateinfo);
        return "Data updated successfully!!";

    }


}

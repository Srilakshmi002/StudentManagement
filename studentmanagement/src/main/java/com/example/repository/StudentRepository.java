package com.example.repository;

import com.example.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

    public List<StudentEntity> getStudentsByStudentID(Long studentID);
}

package com.example.springbootmongodb.example12.service;

import com.example.springbootmongodb.example12.model.Student;
import com.example.springbootmongodb.example12.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

      public Student save(Student student){
        return studentRepository.save(student);
      }


}

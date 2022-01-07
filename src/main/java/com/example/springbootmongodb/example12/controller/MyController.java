package com.example.springbootmongodb.example12.controller;


import com.example.springbootmongodb.example12.model.Student;
import com.example.springbootmongodb.example12.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/stud")
public class MyController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student)
    {
      return studentService.save(student);
    }

    @GetMapping("/")
    public Student getStudent(@RequestBody Student student)
    {
        return studentService.save(student);
    }
}

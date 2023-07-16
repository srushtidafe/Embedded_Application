package com.geekster.EmbeddedApplication.Controller;

import com.geekster.EmbeddedApplication.Model.Student;
import com.geekster.EmbeddedApplication.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("Student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("Student/studentId/{studentId}")
    public Optional<Student> getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId);
    }

    @PostMapping("Student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("Student/studentId/{studentId}")
    public String removeStudentById(@PathVariable Long studentId){
        return studentService.removeStudentById(studentId);
    }
}

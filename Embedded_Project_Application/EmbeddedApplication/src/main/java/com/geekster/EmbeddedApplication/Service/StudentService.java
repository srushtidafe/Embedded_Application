package com.geekster.EmbeddedApplication.Service;

import com.geekster.EmbeddedApplication.Model.Student;
import com.geekster.EmbeddedApplication.Repository.IStudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Long studentId) {
        return studentRepo.findById(studentId);
    }

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Added successfully";
    }

    public String removeStudentById(Long studentId) {
        studentRepo.deleteById(studentId);
        return "Deleted successfully";
    }

}

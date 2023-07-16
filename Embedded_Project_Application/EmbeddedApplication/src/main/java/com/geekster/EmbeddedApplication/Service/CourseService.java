package com.geekster.EmbeddedApplication.Service;

import com.geekster.EmbeddedApplication.Model.Course;
import com.geekster.EmbeddedApplication.Repository.ICourseRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;

    public List<Course> getAllCourse() {
        return courseRepo.findAll();
    }

    public Optional<Course> getCourseById(Long courseId) {
        return courseRepo.findById(courseId);
    }

    public String addCourse(Course course) {
        courseRepo.save(course);
        return "Added successfully";
    }


    public String removeCourseById(Long courseId) {
        courseRepo.deleteById(courseId);
        return "Deleted successfully";
    }
}

package com.geekster.EmbeddedApplication.Controller;

import com.geekster.EmbeddedApplication.Model.Course;
import com.geekster.EmbeddedApplication.Model.Student;
import com.geekster.EmbeddedApplication.Service.CourseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("Course")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }
    @GetMapping("Course/courseId/{courseId}")
    public Optional<Course> getCourseById(@PathVariable Long courseId){
        return courseService.getCourseById(courseId);
    }

    @PostMapping("Course")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @DeleteMapping("Course/courseId/{courseId}")
    public String removeCourseById(@PathVariable Long courseId){
        return courseService.removeCourseById(courseId);
    }
}

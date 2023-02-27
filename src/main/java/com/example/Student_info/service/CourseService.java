package com.example.Student_info.service;

import com.example.Student_info.model.Course;
import com.example.Student_info.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepo;


    //create
    public Course addCourse(Course newCourse) {
        return courseRepo.save(newCourse);
    }

    //get by id
    public Course getCourseById(int id) {
        return courseRepo.findById(id).get();
    }

    //get all
    public List<Course> getAllCourse(){
        return courseRepo.findAll();
    }

    //delete
    public void deleteCourseById(int id) {
        courseRepo.deleteById(id);
    }

    //update
    public void updateCourseById(int id,Course newCourse) {
        Course course = courseRepo.findById(id).get();

        course.setCourse_Id(newCourse.getCourse_Id());
        course.setDescription(newCourse.getDescription());
        course.setDuration(newCourse.getDuration());
        course.setTitle(newCourse.getTitle());
        course.setStudentList(newCourse.getStudentList());

        courseRepo.save(course);
    }
}

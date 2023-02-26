package com.example.Student_info.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="Course_Info")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    @Column(name="course_title")
    private String title;
    @Column(name="course_description")
    private String description;
    @Column(name="course_duration")
    private String duration;
    @ManyToMany
    private List<Student> studentList = new ArrayList<>();
}
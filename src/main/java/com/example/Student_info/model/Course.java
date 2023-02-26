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
    private String ID;
    private String title;
    private String description;
    private String duration;
    @ManyToMany
    List<Student> studentList = new ArrayList<>();
}
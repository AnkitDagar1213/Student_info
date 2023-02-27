package com.example.Student_info.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="Student_Info")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Student_Id;
    @Column(name="student_name")
    private String name;
    @Column(name="student_age")
    private String age;
    @Column(name="phoneNumber")
    private String phoneNumber;
    @Column(name="student_branch")
    private String branch;
    @Column(name="student_dept")
    private String department;

    @Embedded
    private Address address;
}
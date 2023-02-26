package com.example.Student_info.model;
import jakarta.persistence.*;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="Book_Info")
public class Book {
    @Id
    private String Id;
    private String title;
    private String author;
    private String description;
    private String price;
    @ManyToOne
    private Student student;
}
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    @Column(name="book_title")
    private String title;
    @Column(name="book_author")
    private String author;
    @Column(name="book_description")
    private String description;
    @Column(name="book_price")
    private String price;
    @ManyToOne
    private Student student;
}
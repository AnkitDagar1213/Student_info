package com.example.Student_info.model;

import jakarta.persistence.*;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="Laptop_Info")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Laptop_Id;
    @Column(name="laptop_name")
    private String name;
    @Column(name="laptop_brand")
    private String brand;
    @Column(name="laptop_price")
    private int price;

    @OneToOne
    private Student student;
}
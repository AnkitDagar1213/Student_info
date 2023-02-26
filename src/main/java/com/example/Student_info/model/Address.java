package com.example.Student_info.model;

import jakarta.persistence.*;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="Address_Info")
public class Address {
    private String landmark;
    @Id
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
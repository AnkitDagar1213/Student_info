package com.example.Student_info.model;

import jakarta.persistence.*;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    private String zipcode;
    private String landmark;
    private String district;
    private String state;
    private String country;
}
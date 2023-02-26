package com.example.Student_info.service;

import com.example.Student_info.model.Laptop;
import com.example.Student_info.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepo;

    //create
    public Laptop addLaptop(Laptop newLaptop) {
        return laptopRepo.save(newLaptop);
    }
    //get by id
    public Laptop getLaptopById(int id) {
        return laptopRepo.findById(id).get();
    }

    //get all
    public List<Laptop> getAllLaptop(){
        return laptopRepo.findAll();
    }

    //delete
    public void deleteLaptopById(int id) {
        laptopRepo.deleteById(id);
    }

    //update by id

    public void updateLaptopById(int id, Laptop newLaptop) {
        Laptop lap = laptopRepo.findById(id).get();
        lap.setBrand(newLaptop.getBrand());
        lap.setId(newLaptop.getId());
        lap.setName(newLaptop.getName());
        lap.setStudent(newLaptop.getStudent());
        lap.setPrice(newLaptop.getPrice());
        laptopRepo.save(lap);

    }
}

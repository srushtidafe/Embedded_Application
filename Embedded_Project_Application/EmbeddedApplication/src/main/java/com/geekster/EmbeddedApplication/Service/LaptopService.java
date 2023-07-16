package com.geekster.EmbeddedApplication.Service;

import com.geekster.EmbeddedApplication.Model.Laptop;
import com.geekster.EmbeddedApplication.Model.Student;
import com.geekster.EmbeddedApplication.Repository.ILaptopRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;

    public List<Laptop> getAllLaptop() {
        return laptopRepo.findAll();
    }

    public Optional<Laptop> getLaptopById(Long laptopId) {
        return laptopRepo.findById(laptopId);
    }

    public String addLaptop(Laptop laptop) {
         laptopRepo.save(laptop);
         return "Added successfully";
    }


    public String removeLaptopById(Long laptopId) {
        laptopRepo.deleteById(laptopId);
        return "Deleted successfully";

    }
}

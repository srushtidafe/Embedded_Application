package com.geekster.EmbeddedApplication.Controller;

import com.geekster.EmbeddedApplication.Model.Laptop;
import com.geekster.EmbeddedApplication.Model.Student;
import com.geekster.EmbeddedApplication.Service.LaptopService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @GetMapping("Laptop")
    public List<Laptop> getAllLaptop(){
        return laptopService.getAllLaptop();
    }
    @GetMapping("Laptop/laptopId/{laptopId}")
    public Optional<Laptop> getLaptopById(@PathVariable Long laptopId){
        return laptopService.getLaptopById(laptopId);
    }

    @PostMapping("Laptop")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }

    @DeleteMapping("Laptop/laptopId/{laptopId}")
    public String removeLaptopById(@PathVariable Long laptopId){
        return laptopService.removeLaptopById(laptopId);
    }
}

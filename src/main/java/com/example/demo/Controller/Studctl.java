package com.example.demo.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studentity;
import com.exaple.demo.service.Studservice;
@RestController
@RequesMapping("/student")
public class Studctl{
    @Autowired
    private Studentity ser;

    @PostMapping("/add")
    public Studentity addStudent(@RequestBody Studentity st){
        return ser.saveData(st);

    }
    @GetMapping("/getall")
    
}



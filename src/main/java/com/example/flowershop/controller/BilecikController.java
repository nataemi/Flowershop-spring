package com.example.flowershop.controller;

import com.example.flowershop.model.Bilecik;
import com.example.flowershop.repository.BilecikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bilecik")
public class BilecikController {

    @Autowired
    private BilecikRepository bilecikRepository;

    @GetMapping
    public List<Bilecik> list(){
        return bilecikRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bilecik bilecik){
        bilecikRepository.save(bilecik);
    }

    @GetMapping("/{id}")
    public Bilecik get(@PathVariable("id") Long id){
        return bilecikRepository.getOne(id);
    }
}

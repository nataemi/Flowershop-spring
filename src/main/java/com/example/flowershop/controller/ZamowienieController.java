package com.example.flowershop.controller;

import com.example.flowershop.model.Bilecik;
import com.example.flowershop.model.Zamowienie;
import com.example.flowershop.repository.ZamowienieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/zamowienie")
public class ZamowienieController{

    @Autowired
    private ZamowienieRepository zamowienieRepository;

    @GetMapping
    public List<Zamowienie> list(){
        return zamowienieRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Zamowienie zamowienie){
        zamowienieRepository.save(zamowienie);
    }

    @GetMapping("/{id}")
    public Zamowienie get(@PathVariable("id") Long id){
        return zamowienieRepository.getOne(id);
    }

    @GetMapping("/kurier")
    public List<Zamowienie> listCourier() { return zamowienieRepository.findAll();} //zaimplementuj ta metode
}

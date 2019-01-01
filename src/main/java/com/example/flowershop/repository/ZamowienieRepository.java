package com.example.flowershop.repository;

import com.example.flowershop.model.Zamowienie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZamowienieRepository extends JpaRepository<Zamowienie, Long> {
}

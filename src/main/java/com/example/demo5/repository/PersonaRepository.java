package com.example.demo5.repository;


import com.example.demo5.model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Jeanc
 */
public interface PersonaRepository extends JpaRepository<persona, Integer> {
    
}
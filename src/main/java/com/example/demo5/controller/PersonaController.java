package com.example.demo5.controller;

import com.example.demo5.model.persona;
import com.example.demo5.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jeanc
 */
@Controller
public class PersonaController {
    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @GetMapping("/personas")
    public String listarPersonas(Model model) {
        List<persona> personas = personaRepository.findAll();
        model.addAttribute("personas", personas);
        return "listarPersonas"; // Nombre del archivo HTML (listarPersonas.html) en templates
    }
}

package com.example.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {
    @GetMapping("/veterinaria")
    public String abrirClinica(Model model){
        model.addAttribute("nomeVeterinario", "Eva Lucadão");
        model.addAttribute("especializacao", "Canídeos");
        model.addAttribute("anosAtuacao", "10");
        model.addAttribute("sexo", "Feminino");
        model.addAttribute("formacao", "Medicina Veterinária");
        return "veterinaria";
    }
}

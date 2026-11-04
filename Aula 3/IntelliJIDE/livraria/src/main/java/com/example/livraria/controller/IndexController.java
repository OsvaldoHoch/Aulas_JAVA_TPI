package com.example.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {
    @GetMapping("/livraria")
    public String abrirLivraria(Model model){
        model.addAttribute("nomeLivro", "Lucas Evadão");
        model.addAttribute("ISBN", "1234567891011");
        model.addAttribute("paginas", "10");
        model.addAttribute("autor", "Osvaldo");
        model.addAttribute("editora", "Fatec");
        model.addAttribute("categoria", "Romance");
        return "livraria";
    }
}

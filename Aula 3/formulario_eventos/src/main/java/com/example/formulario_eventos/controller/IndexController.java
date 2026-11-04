package com.example.formulario_eventos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class IndexController {
    @GetMapping("/cadastro-evento")
    public String abrirFormulario(){ return "cadastro";}
    @PostMapping("/salvar-evento")
    public String salvarEvento(
            @RequestParam("data") String data,
            @RequestParam("tipo") String tipo,
            @RequestParam("quant") int quant,
            @RequestParam("meia") String meia,
            Model model
        ){
            model.addAttribute("d", data);
            model.addAttribute("t", tipo);
            model.addAttribute("q", quant);
            model.addAttribute("m", meia);
            model.addAttribute("sucesso", true);
            return "cadastro";
        }

}

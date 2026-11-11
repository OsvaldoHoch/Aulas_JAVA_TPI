package br.com.spring.Revisao.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class IndexController {
    @GetMapping("/funcionario")
    public String formulario(){
        return "formulario";
    }
    @PostMapping("/salvar")
    public String cadastrar(
            //Envia como parâmentros os dados a serem cadastrados no formulário
            @RequestParam("nome") String nome,
            @RequestParam("idade") Integer idade,
            @RequestParam("altura") Double altura,
            @RequestParam("cargo") String cargo,
            @RequestParam("datanasc") String datanasc,
            Model model
    ){
        model.addAttribute("n", nome);
        model.addAttribute("i", idade);
        model.addAttribute("a", altura);
        model.addAttribute("c", cargo);
        model.addAttribute("d", datanasc);
        model.addAttribute("sucesso", true);
        return "formulario";
    }
}

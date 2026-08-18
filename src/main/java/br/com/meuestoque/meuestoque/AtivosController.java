package br.com.meuestoque.meuestoque;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtivosController {

    public AtivosController(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    @GetMapping("/ativos")
    public AtivosController getAtivo() {
        return new AtivosController("Notebook", "Notebook Dell");
    }
}
package br.com.projetoescola.escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoescola.escola.entity.Cidade;
import br.com.projetoescola.escola.service.CidadeService;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/cidades")
public class CidadeController {
    
    // Injeção da dependência da service de cidades
    @Autowired
    private CidadeService cidadeService;

    // Método para salvar uma cidade
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Cidade cidade) {
        cidadeService.save(cidade);
        return "redirect:/cursos/listar";
    }

    // Método para listar todas as cidades
    @PostMapping("/listar")
    public String listar(@ModelAttribute Cidade cidade) {
        cidadeService.save(cidade);
        return "redirect:/cursos/listarCidade";
    }

    // Método para excluir uma cidade pelo ID
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        cidadeService.deleteById(id);
        return "redirect:/cursos/listar";
    }
    
}

package br.com.projetoescola.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
 
    //Injeção de dependência da service de cidades
    @Autowired
    private CidadeService cidadeService;
 
    //Método para salvar uma cidade
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Cidade cidade) {
        cidadeService.save(cidade);
        return "redirect:/cidades/listar";
    }
    //Método para listar todas as cidades
    @GetMapping("/listar")
    public String listar(Model model){
        List<Cidade> cidades = cidadeService.findAll();
        model.addAttribute("cidades", cidades);
        return "cidade/listarCidade";
    }
    //Método para abrir o formulário de uma cidade
    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("cidade", new Cidade());
        return "cidade/formularioCidade";
    }
   
    //Método para excluir uma cidade pelo ID
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        cidadeService.deleteById(id);
        return "redirect:/cidades/listar";
    }

    //Método para abrir o formulário de edição de cidades
    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable("id") Integer id, Model model) {
        Cidade cidade = cidadeService.findById(id);
        model.addAttribute("cidade", cidade);
        return "cidade/formularioCidade";
    }

}

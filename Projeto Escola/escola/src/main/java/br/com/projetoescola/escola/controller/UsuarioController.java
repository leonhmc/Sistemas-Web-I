package br.com.projetoescola.escola.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.projetoescola.escola.service.UsuarioService;

@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAtribute("usuario", new Usuario());
        return "usuario/FormularioUsuario";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Usuario usuario) {
        usuarioService.save(usuario);
        return "/login";
    }

}
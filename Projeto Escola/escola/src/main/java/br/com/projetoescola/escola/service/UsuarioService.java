package br.com.projetoescola.escola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    public Usuario save(Usuario usuario){
        //Criptografar a senha antes de salvar
        usuario.setSenhaUsuario(passwordEncoder.encode(usuario.getSenhaUsuario()));
        return usuarioRepository.save(usuario);
    }

    public Usuario findById(Integer id){
        return usuarioRepository.findById(id).orElse(other:null);
    }


    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

}
package br.com.projetoescola.escola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoescola.escola.entity.Curso;
import br.com.projetoescola.escola.repository.CursoRepository;

@Service
public class CursoService {
 
    // Injeção de dependência do repositório de cursos
    @Autowired
    private CursoRepository alunoRepository;
 
    //Método para salvar um curso
    public Curso save(Curso curso){
        return alunoRepository.save(curso);
    }
 
    //Método para listar todos os cursos
    public List<Curso> findAll(){
        return alunoRepository.findAll();
    }
 
   
}

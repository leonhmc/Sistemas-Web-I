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
 
    //Método para excluir um curso pelo ID
    public void deleteById(Integer id){
        cursoRepository.deleteById(id);
    }

    //Método para buscar o curso pelo ID
    public Curso findById(Integer id){
        return cursoRepository.findById(id).orElse(null);
    }

}

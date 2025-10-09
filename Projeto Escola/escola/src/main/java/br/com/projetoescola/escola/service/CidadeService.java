package br.com.projetoescola.escola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoescola.escola.entity.Cidade;
import br.com.projetoescola.escola.repository.CidadeRepository;

@Service
public class CidadeService {

    // Injeção de dependência do repositório de cidades
    @Autowired
    private CidadeRepository cidadeRepository;
 
    //Método para salvar uma cidade
    public Cidade save(Cidade cidade){
        return cidadeRepository.save(cidade);
    }
 
    //Método para listar todas as cidades
    public List<Cidade> findAll(){
        return cidadeRepository.findAll();
    }
 
    //Método para excluir uma cidade pelo ID
    public void deleteById(Integer id){
        cidadeRepository.deleteById(id);
    }

    //Método para buscar a cidade pelo ID
    public Cidade findById(Integer id){
        return cidadeRepository.findById(id).orElse(null);
    }
}

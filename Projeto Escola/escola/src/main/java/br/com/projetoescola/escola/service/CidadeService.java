package br.com.projetoescola.escola.service;

import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    // Injeção de dependência do repositório de cidades
    @Autowired
    private CursoRepository cidadeRepository;
 
    //Método para salvar uma cidade
    public Cidade save(Cidade cidade){
        return cursoRepository.save(cidade);
    }
 
    //Método para listar todas as cidades
    public List<Cidade> findAll(){
        return cidadeRepository.findAll();
    }
 
    //Método para excluir uma cidade pelo ID
    public void deleteById(Integer id){
        cidadeRepository.deleteById(id);
    }

    //Método para buscar o curso pelo ID
    public Cidade findById(Integer id){
        return cursoRepository.findById(id).orElse(null);
    }
}

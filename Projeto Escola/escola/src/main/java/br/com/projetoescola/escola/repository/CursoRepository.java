package br.com.projetoescola.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.projetoescola.escola.dto.AlunoCurso;
import br.com.projetoescola.escola.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
 
    // Listar nome dos cursos
    @Query("SELECT new br.com.projetoescola.escola.dto.AlunoCurso(b.nomeCurso) FROM Aluno a, Pessoa p where p.idPessoa = a.idPessoa") List<AlunoCurso> buscarAlunoCurso();

    // Listar nome dos cursos
    //@Query("SELECT new br.com.projetoescola.escola.dto.AlunoCurso(a.nomeCurso) FROM Aluno a") List<AlunoCurso> buscarAlunoCurso();

}

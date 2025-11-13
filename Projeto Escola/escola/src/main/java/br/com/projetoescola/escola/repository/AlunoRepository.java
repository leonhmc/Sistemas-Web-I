package br.com.projetoescola.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.projetoescola.escola.dto.AlunoCurso;
import br.com.projetoescola.escola.dto.AlunoTelefone;
import br.com.projetoescola.escola.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
   
    // Listar nome e telefone de alunos
    @Query("SELECT new br.com.projetoescola.escola.dto.AlunoTelefone(a.nomePessoa, a.telefoneAluno) FROM Aluno a")
    List<AlunoTelefone> buscarAlunoTelefone();

    // Listar nome e cursos dos alunos
    @Query("SELECT new br.com.projetoescola.escola.dto.AlunoCurso(a.nomePessoa, c.nomeCurso) " +
           "FROM Aluno a " +
           "JOIN a.curso c")
    List<AlunoCurso> buscarAlunoCurso();
}

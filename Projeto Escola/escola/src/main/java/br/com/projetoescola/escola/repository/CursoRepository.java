package br.com.projetoescola.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.projetoescola.escola.dto.AlunoCurso;
import br.com.projetoescola.escola.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
 

}

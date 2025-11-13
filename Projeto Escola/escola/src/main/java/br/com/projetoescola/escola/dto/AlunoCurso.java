package br.com.projetoescola.escola.dto;

public class AlunoCurso {

    private String nomeAluno;
    
    private String nomeCurso;

    public AlunoCurso(String nomeAluno, String nomeCurso) {
        this.nomeAluno = nomeAluno;
        this.nomeCurso = nomeCurso;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    

}

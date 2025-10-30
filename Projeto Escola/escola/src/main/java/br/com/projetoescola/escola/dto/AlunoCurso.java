package br.com.projetoescola.escola.dto;

public class AlunoCurso {
    
    private String nomeCurso;
    public AlunoCurso () {
    }

        public AlunoCurso (String nomeCurso) {
            this.nomeCurso = nomeCurso;
        }
    
        public String getNomeCurso() {
            return nomeCurso;
        }

}

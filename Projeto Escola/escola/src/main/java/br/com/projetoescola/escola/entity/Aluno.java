package br.com.projetoescola.escola.entity;

@entity
public class Aluno {
    
    @id
    @GeneratedValue(strategy = Generation)
    private Integer idAluno;
    private String nomeAluno;
    private String telefoneAluno;
    private String idAluno;
    private String enderecoAluno;
    private String rmAluno;
    private String cpfAluno;
}

package atividade;

public class Materia {
    private String nome;
    private String tipo;
    private int quantidadeHoras;
    private String idFuncionario;

    public Materia(String nome, String tipo, int quantidadeHoras, String idFuncionario) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidadeHoras = quantidadeHoras;
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }
    
    
}

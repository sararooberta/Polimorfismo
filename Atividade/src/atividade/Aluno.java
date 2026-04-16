package atividade;

public class Aluno extends Pessoa{
    private int ra;
    private String curso;

    public Aluno(int ra, String curso, String nome, String cpf) {
        super(nome, cpf);
        this.ra = ra;
        this.curso = curso;
    }
    
    public void matricularMateria (String nome){
        Materia m = new Materia (nome, "Obrigatória", 60, "007");
        System.out.println(m);
    }
    public static String matricularMateria (String nome, int quantidadeHoras){
        Materia m = new Materia (nome, "Optativa", 120, "013");
        System.out.println(m);
        return null;
    }
    
    public static String matricularMateria (String nome, int quantidadeHoras, int idFuncionario){
        Materia m = new Materia (nome, "Extensão", 32, "440");
        System.out.println(m);
        return null;
    }
    
    
}

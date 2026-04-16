package atividade;

public class Atividade {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario ("p123", 2500.0, "Sei lá", "123456789");
        System.out.println(f1.getNome());
        Aluno a1 = new Aluno (123,"Sistemas", "Filipe", "321654987");
        System.out.println(a1.getNome());
        Professor p1 = new Professor (2500.0, "p654",8794.45, "Clevison", "987654321");
        System.out.println(p1.getNome());
    }
    
}

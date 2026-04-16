package atividade;

public class Funcionario extends Pessoa{
    private String idFuncionario;
    private double salario;
    protected double saldoContaBancaria;
    
    public double receberSalario (){
        double rs = this.saldoContaBancaria = this.saldoContaBancaria + this.salario;
        return saldoContaBancaria;
    }

    public Funcionario(String idFuncionario, double salario, String nome, String cpf) {
        super(nome, cpf);
        this.idFuncionario = idFuncionario;
        this.salario = salario;
        this.saldoContaBancaria = 0;
    }

    public double getSaldoContaBancaria() {
        return saldoContaBancaria;
    } 
}

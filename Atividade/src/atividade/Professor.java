package atividade;

public class Professor extends Funcionario{
    private double bonus;

    public Professor(double bonus, String idFuncionario, double salario, String nome, String cpf) {
        super(idFuncionario, salario, nome, cpf);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    
    @Override
    public double receberSalario(){
        this.receberSalario();
        this.saldoContaBancaria += bonus;
        return saldoContaBancaria;
    }
}

public class Funcionario {
    private String nome;
    private int matricula;
    private double SALARIO_BASE;


    public Funcionario(String nome, int matricula, double SALARIO_BASE) {
        this.nome = nome;
        this.matricula = matricula;
        this.SALARIO_BASE = SALARIO_BASE;
    }

    public double calcularSalario() {
        return this.SALARIO_BASE;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Matrícula: " + this.matricula + " | Salário: " + calcularSalario();
    }
}



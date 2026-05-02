public class Producao extends Funcionario {
    private int quantidadePecas;
    private double valorPeca;

    public Producao(String nome, int matricula, double SALARIA_BASE, int quantidadePecas, double valorPeca) {
        super(nome, matricula, SALARIA_BASE);
        this.quantidadePecas = quantidadePecas;
        this.valorPeca = valorPeca;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + (this.quantidadePecas * this.valorPeca);
    }
}

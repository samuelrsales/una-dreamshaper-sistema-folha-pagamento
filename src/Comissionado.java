public class Comissionado extends Funcionario {
    private double valorVendas;
    private double percentualComissao;

    public Comissionado(String nome, int matricula, double SALARIO_BASE, double valorVendas, double percentualComissao) {
        super(nome, matricula, SALARIO_BASE);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        double comissao = this.valorVendas * (this.percentualComissao / 100);
        return super.calcularSalario() + comissao;
    }
}

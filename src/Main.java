import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> listaFuncionario = new ArrayList<>();

        String nomeFuncionario;
        int matriculaFuncionario;

        final double SALARIO_BASE = 2000;
        int operador = -1;

        double valorVendas;
        double percentualComissao;

        int quantidadePecas;
        double valorPeca;


        do {
            try {
                System.out.println("\n======================================");
                System.out.println("\nSISTEMA DE FOLHA DE PAGAMENTO\n");
                System.out.println("======================================\n");

                System.out.println("1. Cadastrar Funcionário Padrão");
                System.out.println("2. Cadastrar Funcionário Comissionado");
                System.out.println("3. Cadastrar Funcionário Produção");
                System.out.println("4. Gerar Folha de Pagamento");

                System.out.println("\nDigite o valor da operação desejada: ");

                operador = sc.nextInt();
                sc.nextLine();

                if (operador < 0 || operador > 4) {
                    System.err.println("\nDigite um número entre 0 e 4.");
                }

                switch (operador) {

                    case 1:
                        System.out.println("Nome do funcionário: ");
                        nomeFuncionario = sc.nextLine();

                        do {
                            System.out.println("Matricula do funcionário: ");
                            matriculaFuncionario = sc.nextInt();

                            if (matriculaFuncionario <= 0) {
                                System.err.println("\nMatricula inválida. Digite um número maior que zero.");
                            }

                        } while(matriculaFuncionario <= 0);

                        listaFuncionario.add(new Funcionario(nomeFuncionario, matriculaFuncionario, SALARIO_BASE));
                        System.out.println("\nFuncionário " + nomeFuncionario + " cadastrado com sucesso!");
                        break;

                    case 2:
                        System.out.println("Nome do funcionário: ");
                        nomeFuncionario = sc.nextLine();

                        do {
                            System.out.println("Matricula do funcionário: ");
                            matriculaFuncionario = sc.nextInt();

                            if (matriculaFuncionario <= 0) {
                                System.err.println("\nMatricula inválida. Digite um número maior que zero.");
                            }
                        } while(matriculaFuncionario <= 0);

                        do {
                            System.out.println("Valor das vendas: ");
                            valorVendas = sc.nextDouble();

                            if (valorVendas <= 0) {
                                System.out.println("Valor das vendas inválido. Digite um número maior que zero.");
                            }
                        } while(valorVendas <= 0);

                        do {
                            System.out.println("Percentual da comissão: ");
                            percentualComissao = sc.nextDouble();

                            if (percentualComissao <= 0) {
                                System.err.println("\nValor das vendas inválido. Digite um número maior que zero.");
                            }
                        } while(percentualComissao <= 0);


                        listaFuncionario.add(new Comissionado(nomeFuncionario, matriculaFuncionario, SALARIO_BASE, valorVendas, percentualComissao));
                        System.out.println("\nFuncionário " + nomeFuncionario + " cadastrado com sucesso!");
                        break;

                    case 3:
                        System.out.println("Nome do funcionário: ");
                        nomeFuncionario = sc.nextLine();

                        do {
                            System.out.println("Matricula do funcionário: ");
                            matriculaFuncionario = sc.nextInt();

                            if (matriculaFuncionario <= 0) {
                                System.err.println("\nMatricula inválida. Digite um número maior que zero.");
                            }
                        } while(matriculaFuncionario <= 0);

                        do {
                            System.out.println("Quantidade de peças produzidas: ");
                            quantidadePecas = sc.nextInt();

                            if (quantidadePecas <= 0) {
                                System.err.println("\nValor das vendas inválido. Digite um número maior que zero.");
                            }
                        } while(quantidadePecas <= 0);

                        do {
                            System.out.println("Valor unitário de cada peça: ");
                            valorPeca = sc.nextDouble();

                            if (valorPeca <= 0) {
                                System.err.println("\nValor das vendas inválido. Digite um número maior que zero.");
                            }
                        } while(valorPeca <= 0);


                        listaFuncionario.add(new Producao(nomeFuncionario, matriculaFuncionario, SALARIO_BASE, quantidadePecas, valorPeca));
                        System.out.println("\nFuncionário " + nomeFuncionario + " cadastrado com sucesso!");
                        break;

                    case 4:
                        if (listaFuncionario.isEmpty()) {
                            System.out.println("\nNenhum funcionário foi cadastrado ainda");
                        } else {

                            System.out.println("\n======================================");
                            System.out.println("\nFOLHA DE PAGAMENTO");
                            System.out.println("\n======================================");

                            for (Funcionario f: listaFuncionario) {
                                System.out.println(f);
                            }

                        }
                        break;
                }

                } catch (InputMismatchException e) {
                    System.err.println("\nDigite um número válido.");
                    sc.nextLine();
                }

        } while (operador != 0);

        sc.close();

    }
}
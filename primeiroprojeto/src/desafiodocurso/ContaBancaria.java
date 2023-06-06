package desafiodocurso;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome = "Richard Nathan";
        String tipoDeConta = "Corrente";
        double saldo = 1997.53;
        int opcao = 0;
        double saque = 0;

        System.out.println("***********************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("\n***********************");

        while(opcao != 4){
            System.out.println("Operações:");
            System.out.println("\n[1] Consultar saldo");
            System.out.println("[2] Depositar");
            System.out.println("[3] Sacar");
            System.out.println("[4] Sair");
            System.out.println("\nDigite a opção desejada:");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é R$" + saldo);
                    break;

                case 2:
                    System.out.println("Informe o montante a receber:");
                    saldo += leitor.nextDouble();
                    System.out.println("O saldo atual é R$" + saldo);
                    break;

                case 3:
                    System.out.println("Informe o montante a retirar:");
                    saque = leitor.nextDouble();
                    if (saldo >= saque) {
                        saldo -= saque;
                        System.out.println("O saldo atual é R$" + saldo);
                    } else {
                        System.out.println("Não há saldo suficiente para fazer esse saque.");
                    }
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Opção inválida.");

            }
        }
    }
}

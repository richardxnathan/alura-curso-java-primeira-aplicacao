package Aula05;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double avaliacaoMedia = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.print("Digite a sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitor.nextDouble();
            if (nota != -1) {
                avaliacaoMedia += nota;
                totalDeNotas++;
            }
        }

        System.out.println("A média de avaliações foi: " + avaliacaoMedia/totalDeNotas);
    }
}

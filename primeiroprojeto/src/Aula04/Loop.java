package Aula04;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double avaliacaoMedia = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a sua avaliação para o filme: ");
            nota = leitor.nextDouble();
            avaliacaoMedia += nota;
        }

        System.out.println("A média de avaliações foi: " + avaliacaoMedia/3);
    }
}

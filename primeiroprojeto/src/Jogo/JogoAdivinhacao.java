package Jogo;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroSorteado = new Random().nextInt(100);
        int tentativa = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número entre 0 e 100: ");
            tentativa = leitor.nextInt();

            if (tentativa > numeroSorteado) {
                System.out.println("O número informado é maior que sorteado.");
            } else if (numeroSorteado > tentativa) {
                System.out.println("O número informado é menor que sorteado.");
            } else {
                System.out.println("Você acertou! O número é: " + numeroSorteado);
                break;
            }
        }
    }
}

package Aula02;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = leitor.nextLine();


        System.out.print("Digite o ano de lançamento: ");
        int anoDeLancamento = leitor.nextInt();

        System.out.print("Digete a sua avaliação para o filme: ");
        double avaliação = leitor.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliação);
    }
}

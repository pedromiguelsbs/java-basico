package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //Altere o exercicio 4 permitindo que o usuário entre com os dados de: população e taxa de crescimento.
        Scanner input = new Scanner(System.in);

        System.out.print("População de A: ");
        int populacaoA = input.nextInt();
        System.out.print("Taxa de crescimento de A (em porcentagem): ");
        double taxaCrescimentoA = input.nextDouble();

        System.out.print("População de B: ");
        int populacaoB = input.nextInt();
        System.out.print("Taxa de crescimento de B (em porcentagem): ");
        double taxaCrescimentoB = input.nextDouble();

        int ano = 1;

        System.out.println("Ano 0: " + populacaoA + " <= " + populacaoB);

        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA*(taxaCrescimentoA/100);
            populacaoB += populacaoB*(taxaCrescimentoB/100);
            if (populacaoA<=populacaoB) {
                System.out.println("Ano " + ano + ": " + populacaoA + " <= " + populacaoB);
            } else {
                System.out.println("Ano " + ano + ": " + populacaoA + " >= " + populacaoB);
            }
            ano++;
        }

        input.close();
    }
}

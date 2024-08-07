package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio04 {
    //Faça um programa que peça 4 notas bimestrais e mostre a média.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nota 1º bimestre: ");
        double nota1 = scn.nextDouble();

        System.out.print("Nota 2º bimestre: ");
        double nota2 = scn.nextDouble();

        System.out.print("Nota 3º bimestre: ");
        double nota3 = scn.nextDouble();

        System.out.print("Nota 4º bimestre: ");
        double nota4 = scn.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média foi: " + media);

        scn.close();
    }
}

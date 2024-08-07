package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Supondo que a população de um país 'A' seja da ordem de 80.000 habitantes com uma taxa de crescimento anual de 3%
        //e que a população de 'B' seja 200.000 habitantes com uma taxa de crescimento de 1.5%.
        //Faça um programa que calcule e escreva o número de anos necessários para que a população do país 'A'
        //ultrapasse ou iguale a população do país 'B'.

        int populacaoA = 80000;
        int populacaoB = 200000;
        int ano = 1;

        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA*0.03;
            populacaoB += populacaoB*0.015;
            if (populacaoA<=populacaoB) {
                System.out.println(ano + ": " + populacaoA + " <= " + populacaoB);
            } else {
                System.out.println(ano + ": " + populacaoA + " >= " + populacaoB);
            }
            ano++;
        }

    }
}

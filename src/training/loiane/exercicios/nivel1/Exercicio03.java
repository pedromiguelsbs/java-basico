package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio03 {
    //Faça um programa que peça dois números e imprima a soma.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double primeiroNumero = scn.nextDouble();

        System.out.print("Digite outro número: ");
        double segundoNumero = scn.nextDouble();

        double somatorio = primeiroNumero + segundoNumero;

        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + somatorio);

        scn.close();
    }
}

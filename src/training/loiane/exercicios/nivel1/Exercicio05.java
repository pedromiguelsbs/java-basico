package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio05 {
    //Faça um programa que converta metros para centímetros.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Valor em metros: ");
        double valorEmMetro = scn.nextDouble();

        double valorEmCentimetro = valorEmMetro * 100;

        System.out.println(valorEmMetro + "m = " + valorEmCentimetro + "cm.");

        scn.close();
    }
}

package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scn.nextDouble();

        if (valor > 0) {
            System.out.println("O valor é positivo");
        } else if (valor == 0) {
            System.out.println("O valor é neutro.");
        } else {
            System.out.println("O valor é negativo");
        }

        scn.close();
    }
}

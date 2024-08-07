package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Faça um programa que peça dois números e imprima o maior deles.
        Scanner scn = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double numero1 = scn.nextDouble();

        System.out.print("Segundo número: ");
        double numero2 = scn.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O maior número digitado foi: " + numero1);
        } else {
            System.out.println("O maior número digitado foi: " + numero2);
        }

        scn.close();
    }
}

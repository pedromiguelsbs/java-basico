package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //Faça um programa que receba dois números inteiros
        //depois, imprima os números inteiros que estão no intervalo compreendido por eles.
        Scanner input = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int numero1 = input.nextInt();
        System.out.print("Numero 2: ");
        int numero2 = input.nextInt();

         while (numero1<numero2) {
             numero1++;
             if (numero1 != numero2) {
                 System.out.print(" |"+ numero1 + "| ");
             }
         }

        input.close();
    }
}

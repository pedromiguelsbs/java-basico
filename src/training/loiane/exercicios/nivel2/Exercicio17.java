package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        //Faça um programa que peça um ano e determine se este ano é ou não bissexto.
        //O ano será bissexto se ele for divisível por 400 ou se ele for divisível por 4 e não por 100.

        Scanner input = new Scanner(System.in);

        System.out.print("Ano: ");
        int ano = input.nextInt();

        if (ano%400==0) {
            System.out.println("É um ano bissexto. (regra 1)");
        } else if (ano%4==0 && ano%100!=0) {
            System.out.println("É um ano bissexto. (regra 2)");
        } else {
            System.out.println("Não é um ano bissexto.");
        }

        input.close();
    }
}

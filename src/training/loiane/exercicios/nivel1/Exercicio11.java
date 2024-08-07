package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio11 {
    //Faça um programa que recebe 2 números inteiros e um número real.
    //Calcule e mostre:
    //a. o produto do dobro do primeiro com metade do segundo .
    //b. a soma do triplo do primeiro com o terceiro.
    //c. o terceiro elevado ao cubo.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int numero1 = scn.nextInt();

        System.out.print("Numero 2: ");
        int numero2 = scn.nextInt();

        System.out.print("Numero 3: ");
        double numero3 = scn.nextDouble();

        double a = (numero1*2)*(numero2/2);
        double b = (numero1*3)+numero3;
        double c = numero3*numero3*numero3;

        System.out.println(a + " | " + b + " | " + c);

        scn.close();
    }
}

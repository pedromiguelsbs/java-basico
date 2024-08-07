package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        //Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
        //(Um número primo é aquele que é divisível somente por ele mesmo e por 1)
        Scanner input = new Scanner(System.in);

        System.out.print("Numero: ");
        int numero = input.nextInt();

        //Crivo de Eratóstenes
        if (numero==2 || numero==3 || numero==5 || numero==7 ) {
            System.out.println("É primo.");
        } else if (numero%2==0 || numero%3==0 || numero%5==0 || numero%7==0) {
            System.out.println("Não é primo.");
        } else {
            System.out.println("É primo");
        }

        input.close();
    }
}

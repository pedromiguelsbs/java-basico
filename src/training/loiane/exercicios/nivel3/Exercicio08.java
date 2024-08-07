package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //Faça um programa que leia 5 números e informe a soma e a média.
        Scanner input = new Scanner(System.in);

        double somatorio = 0;
        for (int i=1; i<=5; i++) {
            System.out.print("Numero " + i + ": ");
            double numero = input.nextDouble();
            somatorio += numero;
        }

        System.out.println("A soma dos números é igual a: " + somatorio);
        System.out.println("A média dos números é igual a: " + somatorio/5);

        input.close();
    }
}

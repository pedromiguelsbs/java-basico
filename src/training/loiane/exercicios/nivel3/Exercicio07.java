package training.loiane.exercicios.nivel3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        //Faça um programa que leia 5 números e informe o maior número.
        Scanner input = new Scanner(System.in);

        ArrayList numeros = new ArrayList();
        for (int i=1; i<=5; i++) {
            System.out.print("Numero " + i + ": ");
            double numero = input.nextDouble();
            numeros.add(numero);
        }

        System.out.println(Collections.max(numeros));

        input.close();
    }
}

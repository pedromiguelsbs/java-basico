package training.loiane.exercicios.nivel3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        //Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
        Scanner input = new Scanner(System.in);

        double maximo = 0;
        double minimo = 0;
        for (int i=1; i<=5; i++) {
            System.out.print("Numero " + i + ": ");
            double numero = input.nextDouble();
            if (i==1) {
                maximo = numero;
                minimo = numero;
            }
            if (numero > maximo) maximo = numero;
            if (numero < minimo) minimo = numero;
        }

        System.out.println("O maior número digitado foi: " + maximo);
        System.out.println("O menor número digitado foi: " + minimo);
        System.out.println("A soma entre eles é: " + (maximo+minimo) );

        input.close();
    }
}

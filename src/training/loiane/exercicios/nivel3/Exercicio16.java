package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        //Faça um programa que calcule o fatorial de um número inteiro fornecido
        //Ex: 5! = 5.4.3.2.1 = 120
        Scanner input = new Scanner(System.in);

        System.out.print("Fatorial de: ");
        int fatorial = input.nextInt();

        int resultado = fatorial;
        for (int i=2; fatorial>i; i++) {;
            resultado *= i;
        }

        System.out.println(fatorial + "!" + " = " + resultado);

        input.close();
    }
}

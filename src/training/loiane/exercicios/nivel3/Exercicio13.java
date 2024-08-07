package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //Faça um programa que peça dois números, base e expoente. Calcule e mostre o primeiro número elevado ao segundo número.
        //Não utilize a funçãode potência da linguagem.
        Scanner input = new Scanner(System.in);

        System.out.print("Base: ");
        int base = input.nextInt();
        System.out.print("Expoente: ");
        int expoente = input.nextInt();

        int resultado = 0;
        for (int i=0; i<expoente; i++) {
            if (i==0) {
                resultado += base;
            } else {
                resultado *= base;
            }
        }
        System.out.println(base + "^" + expoente + " = " + resultado);

        input.close();
    }
}

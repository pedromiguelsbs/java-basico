package training.loiane.exercicios.nivel3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Exercicio14 {
    public static void main(String[] args) {
        //Faça um programa que peça 10 números inteiros.
        //Calcule e mostre a quantidade de números pares e a quantidade de números impares.
        Scanner input = new Scanner(System.in);

        ArrayList numeros = new ArrayList();

        for (int i=1; i<=10; i++) {
            System.out.print("Numero " + i + ": ");
            int numeroDigitado = input.nextInt();
            numeros.add(numeroDigitado);
        }

        ArrayList numerosPares = new ArrayList<>();
        int countPares = 0;
        ArrayList numerosImpares = new ArrayList<>();
        int countImpares = 0;

        for(int i=0; numeros.size()>i; i++) {
            int numeroDaVez = (int) numeros.get(i);
            if (numeroDaVez%2 == 0) {
                countPares += 1;
                numerosPares.add(numeroDaVez);
            } else {
                countImpares += 1;
                numerosImpares.add(numeroDaVez);
            }
        }
        System.out.println("Pares: " + countPares + " | " + numerosPares);
        System.out.println("Impares: " + countImpares + " | " + numerosImpares);

        input.close();
    }
}

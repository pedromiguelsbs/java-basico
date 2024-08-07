package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //Altere o programa anterior para mostrar no final a soma dos números.
        Scanner input = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int numero1 = input.nextInt();
        System.out.print("Numero 2: ");
        int numero2 = input.nextInt();


        int somatorio = 0;
         while (numero1<numero2) {
             numero1++;
             if (numero1 != numero2) {
                 somatorio += numero1;
                 System.out.print(" |"+ numero1 + "| ");
             }
         }

        System.out.println("\nA soma é igual a: " + somatorio);

        input.close();
    }
}

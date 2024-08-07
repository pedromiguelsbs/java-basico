package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        //Faça um programa que leia três números e mostre o maior e o menor deles.
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double n1 = input.nextDouble();
        System.out.print("Segundo número: ");
        double n2 = input.nextDouble();
        System.out.print("Terceiro número: ");
        double n3 = input.nextDouble();

        if (n1>=n2 && n1>=n3) System.out.println("O maior é " + n1);
        else if (n2>=n1 && n2>=n3) System.out.println("O maior é " + n2);
        else if (n3>=n1 && n3>=n2) System.out.println("O maior é " + n3);

        if (n1<=n2 && n1<=n3) System.out.println("O menor é " + n1);
        else if (n2<=n1 && n2<=n3) System.out.println("O menor é " + n2);
        else if (n3<=n1 && n3<=n2) System.out.println("O menor é " + n3);

        input.close();
    }
}

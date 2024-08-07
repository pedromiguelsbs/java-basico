package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //Faça um programa que leia um numero e exiba o dia correspondente da semana.
        //Ex. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valorinválido.
        Scanner input = new Scanner(System.in);

        System.out.print("Dia da semana: ");
        int dia = input.nextInt();

        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Valor inválido");
        }

        input.close();
    }
}

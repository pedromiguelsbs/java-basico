package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Faça um programa que verifique se uma letra digitada é vogal ou consoante.
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scn.next().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println(letra + " é vogal"); break;
            default: System.out.println(letra + " é consoante");
        }

        scn.close();
    }
}

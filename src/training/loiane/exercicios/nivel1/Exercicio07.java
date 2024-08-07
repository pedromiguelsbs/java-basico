package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio07 {
    //Faça um programa que calcule a área de um quadrado. Em seguida mostre o dobro desta área para o usuário.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Valor do lado do quadrado: ");
        int lado = scn.nextInt();
        int area = lado * lado;

        System.out.println("Área: " + area);
        System.out.println("Dobro da área: " + area*2);

        scn.close();
    }
}

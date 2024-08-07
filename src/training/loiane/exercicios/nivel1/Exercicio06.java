package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio06 {
    //Faça um programa que, recebendo o raio de um circulo calcula e sua área.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Valor do raio: ");
        int raioDoCirculo = scn.nextInt();
        double areaDoCirculo = 3.14 * (raioDoCirculo * raioDoCirculo);

        System.out.println("Área do circulo: " + areaDoCirculo);

        scn.close();
    }
}

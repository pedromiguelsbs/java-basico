package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio12 {
    //Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal.
    //P = (72.7*altura)-58
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Altura em metros: ");
        double altura = scn.nextDouble();

        double pesoIdeal = (72.7*altura)-58;

        System.out.println("Seu peso ideal é: " + pesoIdeal + "kg");

        scn.close();
    }
}

package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio10 {
    //Faça um programa que peça a temperatura em graus Celsius,
    //transforme e mostre em graus Farenheit.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Temperatura em graus Celsius: ");
        double temperaturaEmCelsius = scn.nextDouble();
        double temperaturaEmFarenheit = ((temperaturaEmCelsius*1.8)+32);

        System.out.println(temperaturaEmCelsius + "C = " + temperaturaEmFarenheit + "F");

        scn.close();
    }
}

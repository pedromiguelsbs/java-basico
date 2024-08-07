package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio09 {
    //Faça um programa que recebe a temperatura em graus Farenheit.
    //Rransforme e mostre a temperatura em graus Celsius.
    public static void main(String[] args) {
        //C=(5*(F-32)/9)
        Scanner scn = new Scanner(System.in);

        System.out.print("Temperatura em F: ");
        double temperaturaEmFarenheit = scn.nextDouble();

        double temperaturaEmCelsius = (5*(temperaturaEmFarenheit-32)/9);
        System.out.println(temperaturaEmFarenheit + "F = " + temperaturaEmCelsius + "C" );

        scn.close();
    }
}

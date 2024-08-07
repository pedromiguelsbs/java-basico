package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
        //Indique, caso os lados formem um triângulo, se: equilátero, isósceles ou escaleno.
        // - Cond. de Existência: cada lado deve ser menor que a soma dos outros dois;
        // - Equilátero: três lados iguais;
        // - Isósceles: dois lados iguais;
        // - Escaleno: três lados diferentes;
        Scanner input = new Scanner(System.in);

        System.out.print("Lado 1: ");
        int lado1 = input.nextInt();
        System.out.print("Lado 2: ");
        int lado2= input.nextInt();
        System.out.print("Lado 3: ");
        int lado3 = input.nextInt();

        if (lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2) {
            //Equilátero
            if (lado1==lado2 && lado1==lado3) {
                System.out.println("É equilátero");
            } else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
                System.out.println("É isóceles");
            } else if (lado1!=lado2 && lado1!=lado3 && lado3!=lado2) {
                System.out.println("É escaleno");
            }
        } else {
            System.out.println("Não é um triangulo");
        }

        input.close();
    }
}

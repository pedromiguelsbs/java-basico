package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        //Faça um programa que calcule as raízes de uma equação do segundo grau. (ax^2 + bx + c)
        //O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
        //1) Se o usuário informar o valor de A = 0 a equação não é do segundo grau e o programa não deve pedir os demais valores, sendo encerrado;
        //2) Se o delta < 0, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
        //3) Se o delta = 0, a equação possui apenas uma raiz real; Informe-a ao usuário;
        //4) Se o delta > 0, a equação possui duas raiz reais; Informe-a ao usuário;
        Scanner input = new Scanner(System.in);

        System.out.println("ax^2 + bx + c");

        System.out.print("a = ");
        double a = input.nextInt();
        if (a != 0) {

            System.out.print("b = ");
            double b = input.nextInt();

            System.out.print("c = ");
            double c = input.nextInt();

            double delta = (b*b) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Δ<0: A equação não possui raízes reais.");
            } else if (delta == 0) {
                double raizes = (-b + Math.sqrt(delta)) / 2*a;
                System.out.println("Δ=0: As raízes valem: " + raizes);
            } else if (delta > 0) {
                double raiz1 = (-b + Math.sqrt(delta)) / 2*a;
                double raiz2 = (-b - Math.sqrt(delta)) / 2*a;
                System.out.println("Δ>0: As raízes valem: " + raiz1 + " e " + raiz2);
            }
        } else {
            System.out.println("O valor de a deve ser diferente de 0. ");
        }

        input.close();
    }
}

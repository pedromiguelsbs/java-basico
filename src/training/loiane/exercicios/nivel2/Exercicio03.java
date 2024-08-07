package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Faça um programa que verifique se a letra digitada é "F" ou "M".
        //Conforme a letra, escrever: "F - Feminino", "M - Masculino", "Sexo Inválido".
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = scn.next().toUpperCase();

        if (sexo.equals("M")) {
            System.out.println("M - Masculino");
        } else if (sexo.equals("F")) {
            System.out.println("F - Feminino");
        } else {
            System.out.println("Sexo Inválido");
        }

        scn.close();
    }
}

package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio13 {
    //Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal.
    //Utilizando as seguintes fórmulas:
    //Homens: (72.7*h)-58
    //Mulheres: (62.1*h)-44.7
    //Depois, peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso ideal.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Altura em metros: ");
        double altura = scn.nextDouble();

        System.out.print("Sexo (masculino/feminino): ");
        String sexo = scn.next();

        System.out.print("Seu peso atual: ");
        double pesoAtual = scn.nextDouble();

        if (sexo.equals("masculino")) {
            double pesoIdeal = (72.7*altura)-58;
            if (pesoAtual > pesoIdeal) System.out.println("Você está acima do peso ideal " + pesoIdeal + "kg");
            if (pesoAtual < pesoIdeal) System.out.println("Você está abaixo do peso ideal " + pesoIdeal + "kg");
        } else if (sexo.equals("feminino")) {
            double pesoIdeal = (62.1*altura)-44.7;
            if (pesoAtual > pesoIdeal) System.out.println("Você está acima do peso ideal " + pesoIdeal + "kg");
            if (pesoAtual < pesoIdeal) System.out.println("Você está abaixo do peso ideal " + pesoIdeal + "kg");
        }

        scn.close();
    }
}

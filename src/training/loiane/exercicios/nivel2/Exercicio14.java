package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        //Faça um programa que lê duas notas de um aluno numa e calcule a sua média.
        //[MÉDIA]
        //Entre 9 e 10  --> A
        //Entre 7.5 e 9 --> B
        //Entre 6 e 7.5 --> C
        //Entre 4 e 6   --> D
        //Entre 0 e 4   --> E
        //O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente
        //E a mensagem “APROVADO” se o conceito for [A], [B] ou [C] ou “REPROVADO” se o conceito for [D] ou [E].
        Scanner input = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = input.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2)/2;
        System.out.println("Média: " + media);

        if (media <= 10 && media >= 6) {
            System.out.print("APROVADO, ");
            if (media <= 10 && media >= 9) System.out.println("Conceito [A]");
            else if (media < 9 && media >= 7.5) System.out.println("Conceito [B]");
            else if (media < 7.5 && media >= 6) System.out.println("Conceito [C]");
        } else if (media < 6 && media >= 0) {
            System.out.print("REPROVADO, ");
            if (media < 6 && media >= 4) System.out.println("Conceito [D]");
            else if (media < 4 && media >= 0) System.out.println("Conceito [E]");
        } else {
            System.out.println("Notas inválidas");
        }

        input.close();
    }
}

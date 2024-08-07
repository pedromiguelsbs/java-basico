package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //Faça um programa para a leitura de duas notas de um aluno.
        //O programa deve calcular a média alcançada e apresentar:
        //1) "Aprovado". (Se a média alcançada for maior ou igual a sete)
        //2) "Reprovado". (Se a média for menor do que sete)
        //3) "Aprovado com Distinção". (Se a média for igual a dez)
        Scanner input = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = input.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = input.nextDouble();

        double media = (nota1+nota2)/2;

        System.out.println("A média foi: " + media);

        if (media == 10) {
            System.out.println("Aprovado com distinção.");
        } else if (media >= 7 && media < 10 ) {
            System.out.println("Aprovado.");
        } else if (media >= 0 && media < 7){
            System.out.println("Reprovado.");
        } else {
            System.out.println("Valores incorretos");
        }
        
        input.close();
    }
}

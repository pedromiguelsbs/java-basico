package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
        //O usuário deve informar de qual numero ele deseja ver a tabuada.
        Scanner input = new Scanner(System.in);

        System.out.print("Tabuada do número: ");
        int numeroEscolhido = input.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(numeroEscolhido + " x " + i + " = " + numeroEscolhido*i);
        }

        input.close();
    }
}

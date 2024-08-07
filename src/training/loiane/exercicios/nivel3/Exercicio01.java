package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Faça um programa que peça uma nota entre zero e dez. Mostre uma mensagem caso o valor seja inválido
        //e continue pedindo até que o valor seja válido.
        Scanner input = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.print("Nota (0-10): ");
            int nota = input.nextInt();
            if (nota==0 || nota==1 || nota==2 || nota==3 || nota==4 || nota==5 || nota==6 || nota==7 || nota==8 ||nota==9 || nota==10) {
                notaValida = true;
            } else {
                System.out.println("Nota inválida, tente novamente.");
            }
        } while (!notaValida);

        input.close();
    }
}

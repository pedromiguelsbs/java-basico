package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //Faça um programa que pergunte em que turno você estuda.
        //Peça para digitar M (matutino), V (vespertino) ou N (noturno).
        //Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme cada caso.
        Scanner input = new Scanner(System.in);

        System.out.print("[M] - matutino\n[V] - verspertino\n[N] - noturno\nTurno: ");
        String turno = input.next().toUpperCase();

        switch (turno) {
            case "M": System.out.println("Bom Dia!"); break;
            case "V": System.out.println("Boa Tarde!"); break;
            case "N": System.out.println("Bom Noite!"); break;
            default: System.out.println("Valor Inválido!");
        }

        input.close();
    }
}

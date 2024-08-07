package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio02 {
    //Faca um programa que peça um numero e mostre a mensagem: " O número informado foi [numero]".
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numeroDigitado = scn.nextDouble();

        System.out.println(String.format("O número informado foi: " + numeroDigitado));

        scn.close();
    }
}

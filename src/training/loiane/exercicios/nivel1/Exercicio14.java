package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio14 {
    //João comprou um microcomputador para controlar o rendimento diário de seu trabalho.
    //Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento (50kg) deve pagar uma multa de R$4 por quilo excedente.
    //João precisa de um programa que leia a variável peso e verifique se há excesso.
    //Se houver, gravar na variável excesso; E na variável multa deverá constar o valor da multa que João deverá pagar.
    //Caso contrário mostrar tais variáveis com o conteúdo ZERO.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Peso pescado: ");
        double pesoPescado = scn.nextDouble();

        if (pesoPescado > 50) {
            double excesso = pesoPescado - 50;
            double multa = excesso * 4;
            System.out.println("Você excedeu " + excesso + "kg");
            System.out.println("Deverá pagar: R$" + multa);
        } else {
            System.out.println("Peso excedente: 0kg");
            System.out.println("Deverá pagar: R$0");
        }

        scn.close();
    }
}

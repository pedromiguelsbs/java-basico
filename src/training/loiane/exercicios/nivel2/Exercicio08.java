package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
        //sabendo que a decisão é sempre pelo mais barato.
        Scanner input = new Scanner(System.in);

        System.out.print("Preço 1: R$");
        double preco1 = input.nextDouble();
        System.out.print("Preço 2: R$");
        double preco2 = input.nextDouble();
        System.out.print("Preço 3: R$");
        double preco3 = input.nextDouble();

        if (preco1<=preco2 && preco1<=preco3) System.out.println("Deve levar o produto 1 [R$" + preco1 + "]");
        else if (preco2<=preco1 && preco2<=preco3) System.out.println("Deve levar o produto 2 [R$" + preco2 + "]");
        else if (preco3<=preco1 && preco3<=preco2) System.out.println("Deve levar o produto 3 [R$" + preco3 + "]");

        input.close();
    }
}

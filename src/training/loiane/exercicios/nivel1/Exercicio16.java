package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio16 {
    //Faça um programa para uma loja de tintas.
    //O programa deverá pedir o tamanho em m² da área a ser pintada.
    //Considere que a cobertura da tinta é de 1L para cada 3m² e que a tinta é vendida em latas de 18L, que custam R$80.
    //Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Área a ser pintada em m²: ");
        double areaAserPintada = scn.nextDouble();

        double litrosNecessarios = Math.ceil(areaAserPintada/3);
        System.out.println("Para cobrir " + areaAserPintada + "m² você precisará de " + litrosNecessarios + "L de tinta.");

        double latasNecessarias = Math.ceil(litrosNecessarios/18);
        System.out.println("Será necessário comprar " + latasNecessarias + " lata(s) de tinta.");

        double valorTotal = latasNecessarias*80;
        System.out.println("Total: R$" + valorTotal);

        scn.close();
    }
}

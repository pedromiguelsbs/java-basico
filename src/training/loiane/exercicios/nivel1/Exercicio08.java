package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio08 {
    //Faça um programa que pergunte quanto vocé ganha por hora e o numero de horas trabalhadas no més.
    //Calcule e mostre o total do seu salário no referido mês.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Ganho em R$ por hora: ");
        double reaisGanhosPorHora = scn.nextDouble();

        System.out.print("Horas trabalhadas no mês: ");
        int horasTrabalhadasMensalmente = scn.nextInt();

        double salarioTotal = reaisGanhosPorHora * horasTrabalhadasMensalmente;
        System.out.println("Você ganahará: R$" + salarioTotal + " este mês.");

        scn.close();
    }
}

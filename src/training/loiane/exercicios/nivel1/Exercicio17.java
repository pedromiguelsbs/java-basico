package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio17 {
    //Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em m² da área a ser pintada.
    //Considere que a cobertura da tinta é de 1L para cada 6m² e que a tinta é vendida em latas de 18L, que custam R$80
    //ou em galões de 3.6L, que custam R$25
    //Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
    //1) Comprar apenas latas de 18L;
    //2) Comprar apenas galões de 3.6L;
    //3) Misturar latas e galões, de forma que o preço seja o menor. (10% de folga)
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Área a ser pintada em m²: ");
        double areaAserPintada = scn.nextDouble();

        double litrosNecessarios = Math.ceil(areaAserPintada/6);
        System.out.println("Para cobrir " + areaAserPintada + "m² você precisará de " + litrosNecessarios + "L de tinta.");

        //Caso 1
        double latasNecessarias = Math.ceil(litrosNecessarios/18);
        double valorTotalEmLatas = latasNecessarias*80;
        System.out.print("1) Será necessário comprar [" + latasNecessarias + "] lata(s) de tinta de 18L.");
        System.out.println(" [R$" + valorTotalEmLatas + "]");

        //Caso 2
        double galoesNecessarios = Math.ceil(litrosNecessarios/3.6);
        double valorTotalEmGaloes = galoesNecessarios*25;
        System.out.print("2) Será necessário comprar [" + galoesNecessarios + "] galão(oes) de tinta de 3.6L.");
        System.out.println(" [R$" + valorTotalEmGaloes + "]");

        //Caso 3
        double litrosComFolga = Math.ceil(litrosNecessarios*1.1);
        double latasNecessariasCaso3 = Math.floor(litrosNecessarios/18);
        double restoDeLitros = litrosComFolga - (latasNecessariasCaso3*18);
        double galoesNecessariosCaso3 = Math.ceil(restoDeLitros/3.6);
        double valorTotalCaso3 = (latasNecessariasCaso3*80) + (galoesNecessariosCaso3*25);
        System.out.print("3) Será necessário comprar [" + latasNecessariasCaso3 + "] lata(s) de 18L e [" + galoesNecessariosCaso3 + "] galão(oes) de 3.6L. [R$" + valorTotalCaso3 + "]");

        scn.close();
    }
}

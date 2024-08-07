package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio15 {
    //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    //Calcule e mostre o total do seu salário no referido mês.
    //Sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    //1) Salário bruto.
    //2) Quanto pagou de IR.
    //3) Quanto pagou ao INSS.
    //4) Quanto pagou ao sindicato.
    //5) Salário líquido.
    //Calcule os descontos e o salário líquido, conforme a tabela abaixo:
    // R$SB | R$-IR | R$-INSS | R$ -Sind. | R$ = SL
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Ganho por hora R$");
        double ganhoPorHora = scn.nextDouble();

        System.out.print("Horas trabalhadas no mês: ");
        double horasTrabalhadasNoMes = scn.nextDouble();

        double salarioBruto = ganhoPorHora * horasTrabalhadasNoMes;
        double valorDoIR = salarioBruto * 0.11;
        double valorDoINSS = salarioBruto * 0.08;
        double valorDoSindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - valorDoIR - valorDoINSS - valorDoSindicato;

        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("Quanto de IR: R$" + valorDoIR);
        System.out.println("Quanto pagou ao INSS: R$" + valorDoINSS);
        System.out.println("Quanto pagou ao Sindicato: R$" + valorDoSindicato);
        System.out.println("Salário líquido: R$" + salarioLiquido);

        scn.close();
    }
}

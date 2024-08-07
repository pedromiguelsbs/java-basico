package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //Faça um programa para o cálculo de uma folha de pagamento.
        //Sabendo que:
        //- O desconto do IR depende do salário bruto conforme a tabela abaixo.
        //- 10% vai para o INSS.
        //- O valor do FGTS corresponde a 11% do Salário Bruto, mas não é descontado, é a empresa que deposita.

        //O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
        //   [TABELA DE DESCONTOS DO IR]
        // - Salário Bruto até 900 (inclusive) - isento.
        // - Salário Bruto até 1500 (inclusive) - desconto de 5%
        // - Salário Bruto até 2500 (inclusive) - desconto de 10%
        // - Salário Bruto acima de 2500 - desconto de 20%
        Scanner input = new Scanner(System.in);

        System.out.print("Valor da hora trabalhada: R$");
        double valorHoraTrabalhada = input.nextDouble();
        System.out.print("Horas trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();

        double salarioBruto = valorHoraTrabalhada*horasTrabalhadas;

        double porcentagemDoIR = 0;
        double valorDoIR = 0;

        double porcentagemDoINSS = 0.1;
        double valorDoINSS = salarioBruto*porcentagemDoINSS;

        double porcentagemDoFGTS = 0.11;
        double valorDoFGTS = salarioBruto*porcentagemDoINSS;

        if (salarioBruto <= 900) {
            porcentagemDoIR = 0;
            valorDoIR = salarioBruto*porcentagemDoIR;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            porcentagemDoIR = 0.05;
            valorDoIR = salarioBruto*porcentagemDoIR;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            porcentagemDoIR = 0.1;
            valorDoIR = salarioBruto*porcentagemDoIR;
        } else if (salarioBruto > 2500) {
            porcentagemDoIR = 0.2;
            valorDoIR = salarioBruto*porcentagemDoIR;
        }

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("(-) IR: (" + porcentagemDoIR*100 + "%) " + "R$" + valorDoIR);
        System.out.println("(-) INSS: (" + porcentagemDoINSS*100 + "%) " + "R$" + valorDoINSS);
        System.out.println("FGTS: (" + porcentagemDoFGTS*100 + "%) " + "R$" + valorDoFGTS);

        double totalDeDescontos = valorDoIR + valorDoINSS;
        System.out.println("Total de descontos: R$" + totalDeDescontos);

        double salarioLiquido = salarioBruto - totalDeDescontos;
        System.out.println("Salário líquido: R$" + salarioLiquido);

        input.close();
    }
}

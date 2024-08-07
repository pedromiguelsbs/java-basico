package training.loiane.exercicios.nivel2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
        //Você foi contratado para desenvolver o programa que calculará os reajustes.
        //Faça um programa que recebe o salário de um colaborador e calcule o reajuste:
        // - Salários até R$280 (incluindo): aumento de 20%
        // - Salários entre R$280 e R$700: aumento de 15%
        // - Salários entre R$700 e R$1500: aumento de 10%
        // - Salários de R$1500 em diante: aumento de 5%
        //Após o aumento ser realizado, informe na tela:
        //1) Salário antes do reajuste;
        //2) Percentual de aumento aplicado;
        //3) Valor do aumento;
        //4) Novo salário;
        Scanner input = new Scanner(System.in);

        System.out.print("1) Salário atual: R$");
        double salarioAtual = input.nextDouble();
        double porcentagemDoAumento = 0;
        double valorDoAumento = 0;
        double novoSalario = 0;

        if (salarioAtual <= 280) {
            porcentagemDoAumento = 0.2;
            valorDoAumento = salarioAtual * porcentagemDoAumento;
            novoSalario = salarioAtual + valorDoAumento;
        } else if (salarioAtual > 280 && salarioAtual < 700) {
            porcentagemDoAumento = 0.15;
            valorDoAumento = salarioAtual * porcentagemDoAumento;
            novoSalario = salarioAtual + valorDoAumento;
        } else if (salarioAtual >= 700 && salarioAtual < 1500) {
            porcentagemDoAumento = 0.1;
            valorDoAumento = salarioAtual * porcentagemDoAumento;
            novoSalario = salarioAtual + valorDoAumento;
        } else if (salarioAtual >= 1500) { // - Salários de R$1500 em diante: aumento de 5%
            porcentagemDoAumento = 0.05;
            valorDoAumento = salarioAtual * porcentagemDoAumento;
            novoSalario = salarioAtual + valorDoAumento;
        }
        
        System.out.println("2) Aumento de: " + porcentagemDoAumento*100 + "%\n3) Valor do aumento: R$" + valorDoAumento + "\n4) Novo salário: R$" + novoSalario);

        input.close();
    }
}

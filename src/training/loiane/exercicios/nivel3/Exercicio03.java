package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Faça um programa que leia e valide as seguintes informações: nome, idade, salario, sexo e estado civil.

        Scanner input = new Scanner(System.in);

        //1) Nome maior que 3 caracteres;
        boolean nomeValido = false;
        do {
            System.out.print("Nome: ");
            String nome = input.next();
            if (nome.length() >= 3) {
               nomeValido = true;
            } else {
                System.out.println("Nome inválido! Minimo 3 letras.\n");
            }
        } while (!nomeValido);

        //2) Idade entre O e 150;
        boolean idadeValida = false;
        do {
            System.out.print("Idade: ");
            int idade = input.nextInt();
            if (idade >= 0 && idade <= 150) {
                idadeValida = true;
            } else {
                System.out.println("Idade inválida! Deve estar entre 0 e 150.\n");
            }
        } while (!idadeValida);

        //3) Salário maior que zero;
        boolean salarioValido = false;
        do {
            System.out.print("Salário: R$");
            double salario = input.nextDouble();
            if (salario > 0) {
                salarioValido = true;
            } else {
                System.out.println("Salário inválido! Deve ser maior que 0.\n");
            }
        } while (!salarioValido);

        //4) Sexo 'F' ou 'M';
        boolean sexoValido = false;
        do {
            System.out.print("Sexo (M/F): ");
            String sexo = input.next().toUpperCase();
            if (sexo.equals("M") || sexo.equals("F")) {
                sexoValido = true;
            } else {
                System.out.println("Sexo inválido! Digite 'M' para Masculino ou 'F' para Feminino.\n");
            }
        } while (!sexoValido);

        //5) Estado Civil 'S', 'C', 'V' ou 'D';
        boolean estadoCivilValido = false;
        do {
            System.out.print("Estado Civil (S/C/D/V): ");
            String estadoCivil = input.next().toUpperCase();
            if (estadoCivil.equals("S") || estadoCivil.equals("C") || estadoCivil.equals("D") || estadoCivil.equals("V")) {
                estadoCivilValido = true;
            } else {
                System.out.print("Estado Civil inválido! ");
                System.out.println("Digite: 'S' para Solteiro, 'C' para Casado, 'D' para Divorciado ou 'V' para Viúvo.\n");
            }
        } while (!estadoCivilValido);

        input.close();
    }
}

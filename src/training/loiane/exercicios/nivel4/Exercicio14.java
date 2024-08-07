package training.loiane.exercicios.nivel4;

public class Exercicio14 {
    public static void main(String[] args) {
        //Criar um vetor A com 5 elementos inteiros. Implementar um programa que defina e escreva
        //a média aritmética simples dos elementos ímpares armazenados neste vetor.
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        int soma = 0;

        for(int numero : numeros) {
           if (numero%2 != 0) {
               soma += numero;
           }
        }

        double media = (double) soma /numeros.length;

        System.out.println("A média é: " + media);

    }
}

package training.loiane.exercicios.nivel4;

public class Exercicio11 {
    public static void main(String[] args) {
        //Criar um vetor A com 5 elementos inteiros. Implementar um programa que defina e escreva
        //a quantidade de elementos armazenados neste vetor que são pares.
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        int pares = 0;
        int impares = 0;

        for (int numero : numeros) {
            if (numero%2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

    }
}

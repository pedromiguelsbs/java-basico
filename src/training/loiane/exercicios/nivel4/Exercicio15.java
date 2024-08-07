package training.loiane.exercicios.nivel4;

public class Exercicio15 {
    public static void main(String[] args) {
        //Criar um vetor A com 5 elementos inteiros. Desenvolver um programa que defina
        //o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor.
        int[] numeros = new int[6];
        numeros[0] = 1;
        numeros[1] = 1;
        numeros[2] = 3;
        numeros[3] = 5;
        numeros[4] = 5;
        numeros[5] = 2;

        int pares = 0;
        int impares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        double percentualDePares = (double) pares/numeros.length*100;
        double percentualDeImpares = (double) impares/numeros.length*100;

        String percentualDeParesFormatado = String.format("%.2f", percentualDePares);
        String percentualDeImparesFormatado = String.format("%.2f", percentualDeImpares);

        System.out.println("Pares: " + percentualDeParesFormatado + "%");
        System.out.println("Impares: " + percentualDeImparesFormatado+ "%");

    }
}

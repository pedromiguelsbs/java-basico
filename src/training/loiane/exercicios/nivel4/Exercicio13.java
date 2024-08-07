package training.loiane.exercicios.nivel4;

public class Exercicio13 {
    public static void main(String[] args) {
        //Criar um vetor A com 5 elementos inteiros. Implementar um programa que determine a soma dos elementos
        //que são múltiplos de 5.
        int[] numeros = new int[5];
        numeros[0] = 155;
        numeros[1] = 1;
        numeros[2] = 15;
        numeros[3] = 10;
        numeros[4] = 3;

        int soma = 0;

        for(int numero : numeros) {
            if (numero % 5 == 0) {
                soma += numero;
            }
        }

        System.out.println("Soma dos multiplos de 5: " + soma);

    }
}

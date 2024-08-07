package training.loiane.exercicios.nivel4;

public class Exercicio17 {
    public static void main(String[] args) {
        //Ler um vetor A com 5 elementos inteiros correspondentes as idades de um grupo de pessoas.
        //Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 85 anos.
        int[] idades = new int[5];
        idades[0] = 23;
        idades[1] = 54;
        idades[2] = 32;
        idades[3] = 89;
        idades[4] = 65;

        int contador = 0;

        for (int idade : idades) {
            if (idade > 85) {
                contador += 1;
            }
        }

        System.out.println("Pessoas com mais de 85 anos: " + contador);

    }
}

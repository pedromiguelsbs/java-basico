package training.loiane.exercicios.nivel4;

public class Exercicio18 {
    public static void main(String[] args) {
        //Ler um vetor A com 5 elementos inteiros correspondentes as idades de um grupo de pessoas.
        //Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
        int[] idades = new int[5];
        idades[0] = 32;
        idades[1] = 12;
        idades[2] = 42;
        idades[3] = 69;
        idades[4] = 95;


        int max = 0;
        int iMax = 0;
        int min = 0;
        int iMin = 0;

        for (int i=0; i<idades.length; i++) {
            if (i == 0) {
                max = idades[i];
                min = idades[i];
            } else if (idades[i] > max) {
                max = idades[i];
                iMax = i;
            } else if (idades[i] < min) {
                min = idades[i];
                iMin = i;
            }
        }

        System.out.println("A maior idade é: " + max + " e seu index é " + iMax);
        System.out.println("A menor idade é: " + min + " e seu index é " + iMin);

    }
}

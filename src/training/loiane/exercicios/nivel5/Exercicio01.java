package training.loiane.exercicios.nivel5;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        //Gere e imprima uma matriz M 4x4 com valores alcatórios entre 0-9.
        //Após isso determine o maior número da matriz e a sua posição (linha, coluna).
        int[][] m = new int[4][4];

        Random gerador = new Random();

        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++) {
                m[i][j] = gerador.nextInt(10);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int max = 0;
        int linha = 0;
        int coluna = 0;
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++) {
                if (max<m[i][j]) {
                    max = m[i][j];
                    linha = (i+1);
                    coluna = (j+1);
                }
            }
        }

        System.out.println("O valor máximo da matriz é: " + max);
        System.out.println("E se encontra na linha " + linha + " e coluna " + coluna);

    }
}

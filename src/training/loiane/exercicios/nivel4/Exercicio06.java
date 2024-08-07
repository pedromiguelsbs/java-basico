package training.loiane.exercicios.nivel4;

public class Exercicio06 {
    public static void main(String[] args) {
        //Criar dois vetores A e B cada um com 5 elementos inteiros. Construir um vetor C,
        //onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja:
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 4;
        a[2] = 9;
        a[3] = 16;
        a[4] = 25;

        int[] b = new int[5];
        b[0] = 9;
        b[1] = 6;
        b[2] = 1;
        b[3] = 4;
        b[4] = 5;

        int[] c = new int[a.length];

        for (int i=0; i<a.length; i++) {
            c[i] = a[i] + b[i];
        }

        for (int i=0; i<a.length; i++) {
            System.out.println(a[i] + " + "+ b[i] + " = " + c[i]);
        }

    }
}

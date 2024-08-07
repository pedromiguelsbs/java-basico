package training.loiane.exercicios.nivel4;

public class Exercicio01 {
    public static void main(String[] args) {
        //Crie um vetor "A" com 5 elementos inteiros e um vetor "B" ou seja: B[i] = A[i]
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        int[] b = new int[a.length];
        b[0] = a[0];
        b[1] = a[1];
        b[2] = a[2];
        b[3] = a[3];
        b[4] = a[4];

        System.out.println("A[3] = " + a[3]);
        System.out.println("B[3] = " + b[3]);
    }
}

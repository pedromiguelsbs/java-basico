package training.loiane.exercicios.nivel4;

public class Exercicio03 {
    public static void main(String[] args) {
        //Crie um vetor A com 5 elementos inteiros. Construa um vetor B de mesmo tipo e tamanho,
        //sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja:
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        int[] b = new int[a.length];
        b[0] = a[0]*a[0];
        b[1] = a[1]*a[1];
        b[2] = a[2]*a[2];
        b[3] = a[3]*a[3];
        b[4] = a[4]*a[4];

        for (int i=0; i<a.length; i++) {
            System.out.println(a[i] + " -- ^^2 --> " + b[i]);
        }

    }
}

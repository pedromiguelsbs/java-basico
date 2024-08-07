package training.loiane.exercicios.nivel4;

public class Exercicio02 {
    public static void main(String[] args) {
        //Criar um vetor "A" com 8 elementos inteiros e um vetor B de mesmo tipo e tamanho com os elementos do vetor "A"
        //multiplicados por 2. Ou seja: B[i] = A[i] * 2.
        int[] a = new int[8];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        int[] b = new int[a.length];
        b[0] = a[0]*2;
        b[1] = a[1]*2;
        b[2] = a[2]*2;
        b[3] = a[3]*2;
        b[4] = a[4]*2;
        b[5] = a[5]*2;
        b[6] = a[6]*2;
        b[7] = a[7]*2;

        for (int i=0; i<a.length; i++) {
            System.out.println(a[i] + " -- x2 --> " + b[i]);
        }

    }
}

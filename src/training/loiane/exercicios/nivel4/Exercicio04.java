package training.loiane.exercicios.nivel4;

public class Exercicio04 {
    public static void main(String[] args) {
        //Crie um vetor A com 5 elementos inteiros. Construa um vetor B de mesmo tamanho,
        //sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A.
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 4;
        a[2] = 9;
        a[3] = 16;
        a[4] = 25;

        double[] b = new double[a.length];

        for (int i=0; i<a.length; i++) {
           b[i] = Math.sqrt(a[i]);
        }

        for (int i=0; i<a.length; i++) {
            System.out.println(a[i] + " -- raiz --> " + b[i]);
        }

    }
}

package training.loiane.exercicios.nivel4;

public class Exercicio10 {
    public static void main(String[] args) {
        //Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
        //sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 4;
        a[2] = 9;
        a[3] = 16;
        a[4] = 25;

        int[] b = new int[a.length];
        for (int i=0; i<a.length; i++) {
            b[i] = a[i] % 2;
        }

        for(int i=0; i<b.length; i++) {
            System.out.println(a[i] + " % 2" + " = " + b[i]);
        }

    }
}

package training.loiane.exercicios.nivel4;

public class Exercicio16 {
    public static void main(String[] args) {
        //Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
        //a) a soma de elementos armazenados neste vetor que são inferiores a 15;
        //b) a quantidade de elementos armazenados no vetor que são iguais a 15;
        //c) a média dos elementos armazenados no vetor que são superiores a 15.
        int[] numeros = new int[5];
        numeros[0] = 30;
        numeros[1] = 15;
        numeros[2] = 15;
        numeros[3] = 4;
        numeros[4] = 4;

        //A)
        int somatorioDosMenoresQueQuinze = 0;
        //B)
        int qntdIguaisAQuinze = 0;
        //C)
        int somatorioDosMaioresQueQuinze = 0;

        for (int numero : numeros) {
            if (numero < 15) {
                somatorioDosMenoresQueQuinze += numero;
            } else if (numero == 15) {
                qntdIguaisAQuinze += 1;
            } else {
                somatorioDosMaioresQueQuinze += numero;
            }
        }

        int mediaDosMaiores = somatorioDosMaioresQueQuinze/numeros.length;

        System.out.println("Somatorio <15 : " + somatorioDosMenoresQueQuinze);
        System.out.println("Iguais a 15: " + qntdIguaisAQuinze);
        System.out.println("Media dos >15: " + mediaDosMaiores);

    }
}

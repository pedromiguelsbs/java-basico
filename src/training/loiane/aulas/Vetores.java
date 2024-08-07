package training.loiane.aulas;

public class Vetores {
    public static void main(String[] args) {
        //Vetor = Array's
        double[] notas = new double[4]; //4 posições: [0][1][2][3].
        notas[0] = 7.5;
        notas[1] = 9;
        notas[2] = 8.5;
        //notas[3] = 0; (padrão)

        for (int i=0; i< notas.length; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }
        //ou
        for (double nota : notas) {
            System.out.println(nota);
        }


    }
}

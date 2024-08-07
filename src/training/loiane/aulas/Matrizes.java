package training.loiane.aulas;

public class Matrizes {
    public static void main(String[] args) {
        //Matrizes = array de array's
        //[linhas][colunas]
        double[][] notasDeTresAlunos = new double[3][4];

        notasDeTresAlunos[0][0] = 9.5;
        notasDeTresAlunos[0][1] = 10;
        notasDeTresAlunos[0][2] = 5;
        notasDeTresAlunos[0][3] = 7.5;

        notasDeTresAlunos[1][0] = 8;
        notasDeTresAlunos[1][1] = 9.5;
        notasDeTresAlunos[1][2] = 9.5;
        notasDeTresAlunos[1][3] = 10;

        notasDeTresAlunos[2][0] = 5;
        notasDeTresAlunos[2][1] = 8;
        notasDeTresAlunos[2][2] = 5;
        notasDeTresAlunos[2][3] = 7;

        for (int i=0; i<notasDeTresAlunos.length ; i++) {
            for (int j=0; j<notasDeTresAlunos[i].length ; j++) {
                System.out.print(notasDeTresAlunos[i][j] + " ");
            }
            System.out.println();
        }

    }
}

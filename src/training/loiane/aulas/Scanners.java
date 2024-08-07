package training.loiane.aulas;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //String primeiraPalavra = scn.next();
        //int inteiro = scn.nextInt();
        //double flutuante = scn.nextDouble();
        //boolean booleano = scn.nextBoolean();

        String linhaCompleta = scn.nextLine();
        System.out.println("Você digitou: " + linhaCompleta);

        scn.close();
    }
}

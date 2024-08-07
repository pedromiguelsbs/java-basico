package training.loiane.exercicios.nivel3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //A série de Fibonacci é formada pela sequência: 1,1,2,3,5,8,13,21,34,55,...
        //Faça um programa capaz de gerar a série.
        Scanner input = new Scanner(System.in);

        System.out.print("Termo da sequência de Fibonacci: ");
        int termo = input.nextInt();

        ArrayList fibonacci = new ArrayList();
        fibonacci.add(1);
        fibonacci.add(1);

        for (int i=0; i<termo; i++) {
            int n1 = (int) fibonacci.get(i);
            int n2 = (int) fibonacci.get(i+1);
            int result = n1+n2;
            fibonacci.add(result);
        }
        System.out.println("O " + termo + " termo da sequência é: " +fibonacci.get(termo-1));
    }
}

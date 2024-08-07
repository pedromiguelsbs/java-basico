package training.loiane.exercicios.nivel2;

import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //Faça um programa que leia três números e mostre-os em ordem decrescente.
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double n1 = input.nextDouble();
        System.out.print("Segundo número: ");
        double n2 = input.nextDouble();
        System.out.print("Terceiro número: ");
        double n3 = input.nextDouble();

        double auxiliar;

        if (n1<n2) {
            auxiliar = n1;
            n1 = n2;
            n2 = auxiliar;
        }
        if (n1<n3) {
            auxiliar = n1;
            n1 = n3;
            n3 = auxiliar;
        }
        if (n2<n3) {
            auxiliar = n2;
            n2 = n3;
            n3 = auxiliar;
        }
        System.out.println(n1+", "+n2+", "+n3);

        input.close();
    }
}

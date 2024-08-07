package training.loiane.aulas;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Preço R$");
        double preco = scn.nextDouble();

        if (preco <= 10) {
            System.out.println("Barato");
        } else if (preco > 10 && preco <= 15) {
            System.out.println("Normal");
        } else { // == if (preco > 16)
            System.out.println("Caro");
        }

        scn.close();
    }
}

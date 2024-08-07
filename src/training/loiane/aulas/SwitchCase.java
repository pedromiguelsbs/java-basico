package training.loiane.aulas;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Alternativa para vários if's
        System.out.print("Dia da semana (1-7): ");
        int diaDaSemana = scn.nextInt();

        switch (diaDaSemana) {
            case 1: System.out.println("Segunda"); break;
            case 2: System.out.println("Terça"); break;
            case 3: System.out.println("Quarta"); break;
            case 4: System.out.println("Quinta"); break;
            case 5: System.out.println("Sexta"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Valor não válido.");
        }

        scn.close();
    }
}

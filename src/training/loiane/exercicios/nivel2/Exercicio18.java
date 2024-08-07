package training.loiane.exercicios.nivel2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        //Faça um programa que peça uma data no formato dd/mm/aaaa determine se é uma data válida.
        Scanner input = new Scanner(System.in);

        System.out.print("Data (dd/mm/aaaa): ");
        String dataHoje = input.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); //snão poderá haver nenhum erro na String (ex. 10/13/2024 -> erro)

        try {
            Date data = sdf.parse(dataHoje);
            System.out.println("Data válida.");
        } catch(Exception e) {
            System.out.println("Data inválida.");
        }

        input.close();
    }
}

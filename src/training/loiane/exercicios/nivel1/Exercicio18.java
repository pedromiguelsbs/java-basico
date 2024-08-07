package training.loiane.exercicios.nivel1;

import java.util.Scanner;

public class Exercicio18 {
    //Faça um programa que peça o tamanho de um arquivo (em MB) e a velocidade de Internet (em Mbps).
    //Calcule e informe o tempo aproximado de download do arquivo.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Tamanho do arquivo em MB: ");
        double tamanhoDoArquivoMB = scn.nextDouble();

        System.out.print("Velocidade da internet em Mbps: ");
        double velocidadeInternetMbps = scn.nextDouble();
        double velocidadeDownloadMBps = velocidadeInternetMbps/8; //Megabits -> MegaBytes
        double tempoDownloadSegundos = tamanhoDoArquivoMB / velocidadeDownloadMBps;

        System.out.println("O arquivo de " + tamanhoDoArquivoMB + "MB com uma internet de " + velocidadeInternetMbps + "Mbps será baixado em " + tempoDownloadSegundos + " segundos.");

        scn.close();
    }
}

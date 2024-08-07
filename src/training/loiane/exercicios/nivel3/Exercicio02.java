package training.loiane.exercicios.nivel3;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Faça um programa que leia um nome de usuário e a sua senha.
        //Não aceite a senha igual ao nome do usuário, mostre uma mensagem de erro e volte a pedir as informações.
        Scanner input = new Scanner(System.in);

        boolean loginValido = false;

        do {
            System.out.print("Usuário: ");
            String usuario = input.nextLine();

            System.out.print("Senha: ");
            String senha = input.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("A senha deve ser diferente do usuário.\n");
            } else {
                loginValido = true;
            }
        } while (!loginValido);

        input.close();
    }
}

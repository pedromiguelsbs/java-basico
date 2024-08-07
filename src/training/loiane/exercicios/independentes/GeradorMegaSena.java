package training.loiane.exercicios.independentes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GeradorMegaSena {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList lista = new ArrayList();
        while (lista.size() < 5) {
            int numero = random.nextInt(1, 81);
            if (!lista.contains(numero)) lista.add(numero);
        }
        Collections.sort(lista);
        System.out.println(lista);
    }
}

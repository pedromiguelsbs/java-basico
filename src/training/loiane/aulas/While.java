package training.loiane.aulas;

public class While {
    public static void main(String[] args) {

        int i=1;

        //avalia depois executa
        while (i <= 3) {
            System.out.print(i + " ");
            i++;
        }

        //executa depois avalia
        do {
            System.out.println("[" + i + "]");
            i++;
        } while (i < 4); //false, porém executou.

    }
}

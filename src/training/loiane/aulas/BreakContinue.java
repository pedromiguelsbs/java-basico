package training.loiane.aulas;

public class BreakContinue {
    public static void main(String[] args) {

        //Break: para
        for (int i=0; i<10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        //Continue: pula p/ próxima iteração
        for (int i=0; i<10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}

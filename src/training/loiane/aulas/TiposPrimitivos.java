package training.loiane.aulas;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte inteiro1 = (byte) 1; //-128 a 127 [8 bits]
        short inteiro2 = (short) 1; //-32768 a 32767 [16 bits]
        int inteiro3 = 1; //-2.147.483.648 a 2.147.483.647 [32 bits]
        long inteiro4 = 1l; //-9.223.372.036.854.770.000 a 9.223.372.036.854.770.000 [64 bits]

        float decimal1 = 1.45f; // -1,4024E-37 a 3.40282347E + 38 [32 bits]
        double decimal2 = 1.45; // -4,94E-307 a 1.79769313486231570E + 308 [64 bits]

        boolean logico1 = true; // [1 bit]
        boolean logico2 = false;

        char a = 'a'; // 0 a 65535 [16 bits]
    }
}

package Chapter1.Ex9;

/**
 * Created by julian on 16.12.14.
 */
public class Ex9_1 {
    public static void main(String[] args) {
        double a = Double.MIN_VALUE;
        System.out.println("Minimalna wartoħè dodatnia: "+a);
        System.out.println("BIN: "+Long.toBinaryString(Double.doubleToLongBits(a)));
        System.out.println("HEX: "+Double.toHexString(a));
        a = -a;
        System.out.println("Liczba przeciwna: "+a);
        System.out.println("BIN: "+Long.toBinaryString(Double.doubleToLongBits(a)));
        System.out.println("HEX: "+Double.toHexString(a));

    }
}

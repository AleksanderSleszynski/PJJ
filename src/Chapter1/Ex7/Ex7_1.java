package Chapter1.Ex7;

/**
 * Created by julian on 10.12.14.
 */
public class Ex7_1 {
    public static void main(String[] args) {
        System.out.println("Chosen const and methods for Integer Class");
        System.out.println("Minimal value of int: "+Integer.MIN_VALUE);
        System.out.println("Maximal value of int: "+Integer.MAX_VALUE);
        System.out.println("Size of Integer: "+Integer.SIZE);
        int a = 179;
        System.out.println("a = "+a);
        System.out.println("Convert to Binary: "+Integer.toBinaryString(a));
        System.out.println("Convert to Octal: "+Integer.toOctalString(a));
        System.out.println("Convert to Hex: "+Integer.toHexString(a));
        System.out.println("Convert to String: "+Integer.toString(a));
        System.out.println("Convert to String and change radix: "+Integer.toString(a, 4));
        int b = Integer.parseInt("-177");
        System.out.println("b = "+b);
        int c = Integer.parseInt("1000", 8);
        System.out.println("c = "+c);
        System.out.println("Returns what signum has Int: "+Integer.signum(a));
        System.out.println("Returns what signum has Int: "+Integer.signum(b));
        System.out.println("Returns what signum has Int: "+Integer.signum(0));
    }
}

package Chapter2.Ex10;

/**
 * Created by julian on 17.12.14.
 */
public class Ex10_5 {
    public static void main(String[] args) {
        System.out.println("Zna" + "\t" + "OCT" + "\t"+ "DEC" + "\t" + "HEX");

        for(int i=65;i<91;i++) {
            System.out.print((char)i);
            System.out.print('\t');
            System.out.printf("%o", i);
            System.out.print('\t');
            System.out.printf("%d", i);
            System.out.print('\t');
            System.out.printf("%h", i);
            System.out.println();
        }
    }
}

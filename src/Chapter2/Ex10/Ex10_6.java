package Chapter2.Ex10;

/**
 * Created by julian on 18.12.14.
 */
public class Ex10_6 {
    public static void main(String[] args) {
        double rad = 2;

        double deg = Math.toDegrees(rad);
        int d = (int)deg;

        double min = (deg - d)*60;
        int m = (int) min;

        double sec = (min - m)*60;
        int s = (int) sec;

        System.out.println(d + " " + m + " " + s);
    }
}

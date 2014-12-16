package Chapter2.Ex10;

/**
 * Created by julian on 16.12.14.
 */
public class Ex10_4 {
    public static void main(String[] args) {
        for(double i = 2; i < 11;i++ ){
            System.out.printf("%.6f",Math.pow(2,1/i));
            System.out.println();
        }
    }
}

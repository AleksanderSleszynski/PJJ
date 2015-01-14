package Chapter2.Ex11;

import java.util.Scanner;

/**
 * Created by julian on 14.01.15.
 */
public class Ex11_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj długości przyprostokatnych: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println(c);
    }


}

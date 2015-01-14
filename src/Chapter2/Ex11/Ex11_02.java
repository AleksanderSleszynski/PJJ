package Chapter2.Ex11;

import java.util.Scanner;

/**
 * Created by julian on 14.01.15.
 */
public class Ex11_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj temperature w Farenheitach: ");
        double tempreture = sc.nextDouble();
        System.out.println("Temperatura: \n" + ((tempreture-32)/1.8));


    }
}

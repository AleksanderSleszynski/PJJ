package Chapter2.Ex11;

import java.util.Scanner;

/**
 * Created by julian on 14.01.15.
 */
public class Ex11_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celcius tempreture");
        double tempreture = sc.nextDouble();
        System.out.println("Farenhite tempreture is: \n" + (32+(1.8*tempreture)));
    }
}

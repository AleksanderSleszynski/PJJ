package Chapter1.Ex4;

/**
 * Created by julian on 27.11.14.
 */
public class Ex4_3 {
    public static void main(String[] args) {
        String good = "Good Morning";

        for(int i = 0 ; i < good.length();i++){
            System.out.println(good.charAt(i));
        }

        for(int i = 0 ; i < good.length(); i++){
            System.out.print(good.charAt(i) + " ");
        }

        System.out.println();
        System.out.println(good.toUpperCase());
        System.out.println(good.toLowerCase());
    }
}

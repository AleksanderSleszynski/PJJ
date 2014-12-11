package Chapter1.Ex6;

/**
 * Created by julian on 10.12.14.
 */
public class Ex6_8 {
    public static void main(String[] args) {

        String a = "A\240b3&4\040";
        String b = "Łoś_0+\t";
        //String c = "#\ \304\\\344\b\n";

        test(a);
        test(b);
    }


    public static void test(String x) {
        System.out.println(x);
        for(int i=0; i<x.length()-1;i++) {
            System.out.print(Character.isLetter(x.charAt(i)) + " ");
            System.out.print(Character.isDigit(x.charAt(i)) + " ");
            System.out.print(Character.isLetterOrDigit(x.charAt(i)) + " ");
            System.out.print(Character.isLowerCase(x.charAt(i)) + " ");
            System.out.print(Character.isSpaceChar(x.charAt(i)) + " ");
            System.out.print(Character.isUpperCase(x.charAt(i)) + " ");
            System.out.print(Character.isWhitespace(x.charAt(i)) + " "+'\n');
        }
    }
}
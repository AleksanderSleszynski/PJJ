package Chapter1.Ex3;

/**
 * Created by julian on 27.11.14.
 */
public class Ex3_6 {
    public static void main(String args[]) {
/* Informacje o metodzie */
        System.out.println("Klasa: java.lang.Character");
        System.out.println("Metoda statyczna: digit\n");
        System.out.println("static int digit(int ch, int radix)");
        System.out.println("Returns the numeric value of the character c in the specified radix.");
        System.out.println();
/* Przykáadowa tablica znaków */
        char znak[] = {'E', 'u', 'r', 'o', ' ', '2', '0', '1', '2'};
/* Demonstracja dziaáania metody */
        System.out.println("Wartoħè znaku jako cyfry w ukđadzie dziesiætkowym (radix = 10)");
        for(char z : znak) System.out.println("Znak: "+z+" Cyfra: "+Character.digit(z, 10));
            System.out.println("Uwaga: -1 oznacza, ľe znak nie jest cyfræ w tym ukđadzie liczbowym.");
        System.out.println();
        System.out.println("Wartoħè znaku jako cyfry w ukđadzie szesnastkowym (radix = 16)");
        for(char z : znak)
            System.out.println("Znak: "+z+" Cyfra: "+Character.digit(z, 16));
        System.out.println("Uwaga: -1 oznacza, ľe znak nie jest cyfræ w tym ukđadzie liczbowym.");
        }
}


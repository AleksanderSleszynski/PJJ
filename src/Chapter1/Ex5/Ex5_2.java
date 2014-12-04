package Chapter1.Ex5;

/**
 * Created by julian on 04.12.14.
 */
public class Ex5_2 {
    public static void main(String[] args) {
        System.out.println("Nazwisko: " + args[1]);
        System.out.println("Imie: " + args[0]);
        System.out.println("Nazwisko i imie: " + args[1].toUpperCase() + " " +args[0]);
        System.out.println("Inicjaly: " + args[0].charAt(0) + args[1].charAt(0));
        System.out.println("Login: " + args[1].substring(0,2).toUpperCase()+args[0].substring(0,3).toLowerCase());
    }
}

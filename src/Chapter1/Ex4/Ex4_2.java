package Chapter1.Ex4;

/**
 * Created by julian on 27.11.14.
 */
public class Ex4_2 {
    public static void main(String[] args) {

        String string = "Zadania z programowania.";
        String prog     = "prog";
        String adania   = "adania";
        String dania    = "dania";
        String ania     = "ania";
        String anka     = "anka";
        String zPod     = "z podpowiedziami";
        String zOdp     = "z odpowiedziami.";

        char kropka     = '.';
        char pytanie    = '?';
        char z          = 'z';

        System.out.println(string);
        System.out.println(string.charAt(0));
        System.out.println(string.length());
        System.out.println(string.charAt(23));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.indexOf(z));
        System.out.println(string.indexOf(prog));
        System.out.println(string.replace(kropka, pytanie));
        System.out.println(string.replace(adania, dania));
        System.out.println(string.replaceAll(ania, anka));
        System.out.println(string.replaceFirst(ania, anka));
        System.out.println(string.substring(10));
        System.out.println(string.substring(10, 17));
        System.out.println(string.concat("\b" + zPod));
        System.out.println(string+"\b"+zOdp);
    }

}

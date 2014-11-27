package Chapter1;

/**
 * Created by julian on 27.11.14.
 */
public class Ex3_3 {
    public static void main(String[] args) {

        char word[] = {'p', 'r' ,'o', 'g', 'r', 'a', 'm', 'i', 'n', 'g'};

        System.out.print(Character.toUpperCase(word[0]));
        for (int i = 1; i < word.length; i++) {
            System.out.print(word[i]);
        }

        System.out.println();

        for (int i = 0; i < word.length; i++) {
            System.out.print(Character.toUpperCase(word[i]));
        }


    }
}

package Chapter1.Ex3;

/**
 * Created by julian on 27.11.14.
 */
public class Ex3_4 {
    public static void main(String[] args) {

        char word[] = {'p', 'r' ,'o', 'g', 'r', 'a', 'm', 'i', 'n', 'g'};

        for(int i = word.length-1; i >= 0 ; i--){
            System.out.print(word[i]);
        }
    }
}

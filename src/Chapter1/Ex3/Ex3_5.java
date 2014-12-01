package Chapter1.Ex3;

/**
 * Created by julian on 27.11.14.
 */
public class Ex3_5 {
    public static void main(String[] args) {

        char word[] = {'p', 'r' ,'o', 'g', 'r', 'a', 'm', 'i', 'n', 'g', '+'};
        char temp;

        int length = word.length;
        int j = word.length-1;

        for(int i = 0; i < 5 ; i++){
            temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            j--;
        }
        System.out.println(word);
    }
}

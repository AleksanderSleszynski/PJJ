package Chapter1.Ex3;

/**
 * Created by julian on 27.11.14.
 */
public class Ex3_8 {
    public static void main(String[] args) {

        char numbers[] = new char[16];
        int j = 0;

        for(int i = 48; i < 58; i++) {
            System.out.print(numbers[j] = (char) i);
            j++;
        }


        for(int i = 65; i < 71; i++){
            System.out.print(numbers[j] = (char)i);
            j++;
        }
    }
}


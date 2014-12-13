package Chapter1.Ex8;

/**
 * Created by julian on 13.12.14.
 */
public class Ex8_5 {
    public static void main(String[] args) {
        byte[] info = {115, 122, 121, 102, 114};
        int a;
        for(int i= 0 ; i < info.length; i++) {
            System.out.println(Character.getNumericValue(info[i]));
        }
    }
}

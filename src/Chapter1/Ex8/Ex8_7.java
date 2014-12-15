package Chapter1.Ex8;

/**
 * Created by julian on 15.12.14.
 */
public class Ex8_7 {
    public static void main(String[] args) {
        byte[] info = {115, 122, 121, 102, 114};
        for(int i= 0 ; i < info.length; i++) {
            System.out.println(Integer.toHexString(Character.getNumericValue(info[i])));
        }
    }
}

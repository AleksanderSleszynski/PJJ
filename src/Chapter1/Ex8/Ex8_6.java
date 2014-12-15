package Chapter1.Ex8;

import java.io.UnsupportedEncodingException;

/**
 * Created by julian on 13.12.14.
 */
public class Ex8_6 {
    public static void main(String[] args)  throws UnsupportedEncodingException {

        String a = "123";
        long c = 321;
        int scorea = 0;
        byte[] infoBin = a.getBytes("UTF-8");
        for (byte b : infoBin) {
            scorea += Character.getNumericValue(b);
        }
        System.out.println(scorea);

        
    }
}

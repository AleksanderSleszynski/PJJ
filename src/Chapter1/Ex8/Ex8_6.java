package Chapter1.Ex8;

import java.io.UnsupportedEncodingException;

/**
 * Created by julian on 13.12.14.
 */
public class Ex8_6 {
    public static void main(String[] args)  throws UnsupportedEncodingException {

        String a = "12333";
        long c = 33321;
        int scorea = 0;
        int scoreb = 0;
        byte[] infoBin = a.getBytes("UTF-8");
        for (byte b : infoBin) {
            scorea += Character.getNumericValue(b);
        }
        System.out.println(scorea);

        while( c > 0){
            scoreb += c % 10;
            c /= 10;
        }
        System.out.println(scoreb);

    }
}

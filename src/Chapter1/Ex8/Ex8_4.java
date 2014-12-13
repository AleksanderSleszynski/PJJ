package Chapter1.Ex8;

import java.io.UnsupportedEncodingException;

/**
 * Created by julian on 13.12.14.
 */
public class Ex8_4 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] infoBin = "Programing".getBytes("UTF-8");
        for (byte b : infoBin) {
            System.out.println(Integer.toBinaryString(b));
        }
    }
}

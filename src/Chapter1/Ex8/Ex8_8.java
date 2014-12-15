package Chapter1.Ex8;

/**
 * Created by julian on 15.12.14.
 */
public class Ex8_8 {
    public static void main(String[] args) {
        String hex = "736f00496e205e673e50656e64756c756d496e2053696c69636f3030380050656e64756c756d50656e64756c756d496e2053696c69636f303038004d50330000";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < hex.length(); i+=2) {
            String str = hex.substring(i, i+2);
            output.append((char)Integer.parseInt(str, 16));
        }

    }
}

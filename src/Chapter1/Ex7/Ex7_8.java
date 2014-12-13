package Chapter1.Ex7;

/**
 * Created by julian on 13.12.14.
 */
public class Ex7_8 {
    public static void main(String[] args) {
        System.out.println(changer("100",2));
    }
    public static int changer(String a, int b){
        return Integer.parseInt(a,b);
    }
}

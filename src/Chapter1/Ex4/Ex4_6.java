package Chapter1.Ex4;

/**
 * Created by julian on 01.12.14.
 */
public class Ex4_6 {
    public static void main(String[] args) {
        String word = "Programing";
        String temp = "";
        for(int i = word.length()-1;i > -1;i--){
            temp += word.charAt(i);
        }
        System.out.println(temp);
    }
}

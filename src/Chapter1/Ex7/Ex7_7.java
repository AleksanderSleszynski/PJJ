package Chapter1.Ex7;

/**
 * Created by julian on 13.12.14.
 */
public class Ex7_7 {
    public static void main(String[] args) {
        int score= 0;
        for( int i =0; i < args.length;i++){
            score += Integer.parseInt(args[i]);
        }
        System.out.println(score);
    }
}

package Chapter1.Ex5;

/**
 * Created by julian on 04.12.14.
 */
public class Ex5_4 {
    public static void main(String[] args) {
        for(int i = args.length-1;i>=0;i--){
            for(int j = args[i].length()-1;j>=0;j--) {
                System.out.print(args[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}

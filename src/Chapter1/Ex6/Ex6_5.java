package Chapter1.Ex6;

/**
 * Created by julian on 04.12.14.
 */
public class Ex6_5 {
    public static void main(String[] args) {
        boolean multi[][]={
                {true, true},
                {true, false},
                {false, true},
                {false, false}
        };
        System.out.println("XOR");
        for(int i = 0; i < 4 ; i++){
            if(multi[i][0] != multi[i][1] ){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}

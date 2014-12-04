package Chapter1.Ex6;

/**
 * Created by julian on 04.12.14.
 */
public class Ex6_6 {
    public static void main(String[] args) {
        boolean m[][] = {
                //p     q      r
                {true, true, true},
                {true, true, false},
                {true, false, true},
                {true, false, false},
                {false, true, true},
                {false, true, false},
                {false, false, true},
                {false, false, false},
        };


        System.out.println("Prawo przechodnosci implikacji");
        for (int i = 0; i < 8; i++) {
            System.out.println();
        }
    }

    private static void impl(boolean b, boolean b1, int a, int b2 ) {
        if(b[][a] == true && b1[][b] == false){
            System.out.println(false);
        } else {
            System.out.println(true);
        }

    }

    public boolean impl(boolean x[][],boolean y[][], int a, int b){
        for(int i = 0; i < 4 ; i++){
            if(x[i][a] == true && y[i][b] == false){
                System.out.println(false);
            } else {
                System.out.println(true);
            }
        }
        return true;
    }


}

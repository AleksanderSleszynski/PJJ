package Chapter1.Ex6;

/**
 * Created by julian on 04.12.14.
 */
public class Ex6_4 {
    public static void main(String[] args) {
        boolean multi[][]={
                {true, true},
                {true, false},
                {false, true},
                {false, false}
        };
        System.out.println("Implikacja matematyczna");
        for(int i = 0; i < 4 ; i++){
            if(multi[i][0] == true && multi[i][1] == false){
                System.out.println(false);
            } else {
                System.out.println(true);
            }
        }
    }
}

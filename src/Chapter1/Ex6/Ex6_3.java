package Chapter1.Ex6;

/**
 * Created by julian on 04.12.14.
 */
public class Ex6_3 {
    public static void main(String[] args) {
        boolean multi[][]={
                {true, true},
                {true, false},
                {false, true},
                {false, false}
        };

        System.out.println("I prawo De Morgana");
        for(int i = 0; i < 4; i++){
            System.out.println(!(multi[i][0]&&multi[i][1])==(!multi[i][0]||!multi[i][1]));
        }

        System.out.println('\n'+"II prawo De Morgana");
        for(int i = 0; i< 4; i++){
            System.out.println(!(multi[i][0]||multi[i][1])==(!multi[i][0]&&!multi[i][1]));
        }

    }
}

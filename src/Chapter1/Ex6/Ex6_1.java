package Chapter1.Ex6;

/**
 * Created by julian on 04.12.14.
 */
public class Ex6_1 {
    public static void main(String[] args) {

        boolean[][]multi = new boolean[][]{
                {true,true},
                {true,false},
                {false,true},
                {false,false}
        };

        System.out.println("AND");
        for(int j =0; j <4; j++){
            System.out.println(multi[j][0] && multi[j][1]);
        }


        System.out.println("OR");
        for(int j =0; j <4; j++){
            System.out.println(multi[j][0] || multi[j][1]);
        }

        boolean[]single = new boolean[]{true,false};
        System.out.println("NOT");
        for(int i = 0 ; i <2 ; i++){
            System.out.print(!single[i] + " ");
        }
    }
}

package Chapter1.Ex6;

/**
 * Created by julian on 04.12.14.
 */
public class Ex6_2 {
    public static void main(String[] args) {
        boolean single[]= {true, false};

        System.out.println("Prawo wylaczonego srodka");
        for(int i = 0; i < 2; i++){
            System.out.println(single[i]||!single[i]);
        }

        System.out.println("Prawo niesprzecznosci");
        for(int i = 0; i < 2; i++){
            System.out.println(!(single[i] && (!single[i])));
        }

        System.out.println("Prawo podwojnego przeczenia");
        for(int i = 0; i < 2; i++ ){
            System.out.println(!(!single[i])==single[i]);
        }
    }
}

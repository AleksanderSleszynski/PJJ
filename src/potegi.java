/**
 * Created by julian on 04.12.14.
 */
public class potegi {
    public static void main(String[] args){
        int POTEGA = 1000;
        int licznik = 3;
        long wynik = 0;
        for(int i = -1 ; i < POTEGA-1; i++){
            wynik +=((2 * i) +licznik);
            System.out.println(wynik);
        }

    }
}

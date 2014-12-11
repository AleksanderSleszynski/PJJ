package Chapter1.Ex6;

import com.sun.org.apache.xpath.internal.SourceTree;

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
            System.out.println(impl((impl(m[i][0],m[i][1]) && impl(m[i][1],m[i][2])),(impl(m[i][0],m[i][2]))));
        }

        System.out.println('\n' +"Prawo rozdzielnosci alternatywy wzgledem koniunkcji");
        for (int i = 0; i < 8; i++){
            System.out.println((m[i][0] || (m[i][1] && m[i][2])) == ((m[i][0] || m[i][1]) && (m[i][0] || m[i][2])));
        }

        System.out.println('\n' + "Prawo rodzielnosci koniunkcji wzgledem alternatywy" );
        for(int i = 0; i < 8; i++){
            System.out.println((m[i][0] && (m[i][1] || m[i][2])) == ((m[i][0] && m[i][1]) || (m[i][0] && m[i][2])));
        }

        System.out.println('\n' + "Prawo odrywania");
        for(int i = 0; i < 8; i++){
            System.out.println(impl((impl(m[i][0],m[i][1]) && m[i][1]),m[i][1]));
        }

        System.out.println('\n' + "Prawo eliminacji implkacji");
        for(int i = 0; i<8; i++){
            System.out.println((impl(m[i][0],m[i][1]) == (!m[i][0] || m[i][1])));
        }
    }

    private static boolean impl(boolean b, boolean b1) {
        if(b == true && b1 == false){
            return false;
        } else {
            return true;
        }

    }



}

/**
 * Created by julian on 04.12.14.
 */
public class square {
    public static void main(String[] args){

        //Algorithm  with replace power to square. Idea of it was taken from one of my student. She's pretty smart  :)
        int power = 1000;
        int starter = 3;
        long score = 0;
        for(int i = -1 ; i < power-1; i++){
            score +=((2 * i) +starter);
            System.out.println(score);
        }

    }
}

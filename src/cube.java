/**
 * Created by julian on 12.12.14.
 */
public class cube {
    public static void main(String[] args) {
        //Algorithm to cube made by the same person not so good as square but pretty nice i think :)

        long power = 6;
        int starter = 7;
        int score = 8;
        int add = 0;
        System.out.println(1);
        System.out.println(8);
        for(int i = 0; i < power; i++){
            add += 12 + (6*i);
            score += add + starter;
        }
        System.out.println(score);
    }
}

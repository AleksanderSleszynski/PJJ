package Chapter2.Ex10;

/**
 * Created by julian on 16.12.14.
 */
public class Ex10_3 {
    public static void main(String[] args) {
        int arr [] = {2, 3, 5, 7, 11, 13, 17};
        for(int i=0; i < arr.length-1;i++){
            System.out.print(arr[i] + "\t");
            System.out.printf("%.10f",Math.sqrt(arr[i]));
            System.out.print("\t");
            System.out.printf("%.10f",Math.cbrt(arr[i]));
            System.out.println();
        }
    }
}

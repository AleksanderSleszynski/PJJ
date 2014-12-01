package Chapter1.Ex3;

import java.lang.*;

public class Ex3_2 {
    public static void main(String[] args) {

        char word[]= {'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'i', 'c', 's'};

        int x = word.length;

        for (int i = 0; i < x; i++){
            System.out.println(word[i]);
        }

        System.out.println();

        for (int i = 0; i < x; i++){
            System.out.print(word[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < x; i++) {
            System.out.print(Character.toLowerCase(word[i]));
        }

        System.out.println();

        for (int i = 0; i < x; i++) {
            System.out.print(Character.toUpperCase(word[i]));
        }

    }
}

package exercises2;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                System.out.print(array[i]);
            }
        }
        String seuss = new String("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.");
        String[] stringArray = seuss.split("\\.");
        for (String index: stringArray){
            System.out.println(index);
        }
    }
}

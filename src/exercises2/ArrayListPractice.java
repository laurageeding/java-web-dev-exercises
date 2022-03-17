package exercises2;

import java.util.ArrayList;

public class ArrayListPractice {

    static int findSum(ArrayList<Integer> arr) {
        Integer sum = 0;
        for (int i = 0; i < 10; i++) {
            if (arr.get(i) % 2 == 0) {
                sum = sum + arr.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.print(findSum(numbers));
    }

}

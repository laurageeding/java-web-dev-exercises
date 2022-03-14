package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        double length;
        double width;
        double area;

        Scanner inputLength = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        length = inputLength.nextDouble();

        Scanner inputWidth = new Scanner(System.in);
        System.out.println("What is the width of the rectangle?");
        width = inputWidth.nextDouble();
        inputWidth.close();
        inputLength.close();

        area = length * width;
        System.out.println("The area of the rectangle is " + area);

    }
}

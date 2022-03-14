package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;

        Scanner inputRadius = new Scanner(System.in);
        System.out.println("Enter a radius");
        radius = inputRadius.nextDouble();
        inputRadius.close();

        //area = 3.14 * radius * radius;

        if (radius < 0) {
            System.out.println("Invalid. Enter a positive number.");
        } else {
            System.out.println("The area of the circle is " + Circle.getArea(radius));
        }
    }
}
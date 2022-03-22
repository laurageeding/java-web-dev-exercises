package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius");
        radius = input.nextDouble();

        do {
            System.out.println("Please enter a valid number:");

            while(!input.hasNextDouble()) {
                System.out.println("WRONG");
                //radius = input.nextDouble();
                input.next();
            }
        } while(radius <= 0);

//        while(!input.hasNextDouble()) {
//            System.out.println("Please enter valid number:");
//            input.next();
//        }
//
//        radius = input.nextDouble();
//
//        while(radius <= 0){
//            System.out.println("Please enter a valid number:");
//            input.next();
//        }
//
//        radius = input.nextDouble();

        double area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area);
        input.close();
        }
    }

package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double milesPerGallon;

        Scanner inputMiles = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = inputMiles.nextDouble();

        Scanner inputGallons = new Scanner(System.in);
        System.out.println("How many gallons have you consumed?");
        gallons = inputGallons.nextDouble();
        inputGallons.close();
        inputMiles.close();

        milesPerGallon = miles / gallons;
        System.out.println("Your MPG is " + milesPerGallon);

    }
}

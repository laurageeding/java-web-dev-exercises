package org.launchcode.java.studios.restaurant;

public class Menu {
    public static void main(String[] args) {
        MenuItem crabRangoon = new MenuItem("Crab Rangoon", 4, "Appetizer", true);
        System.out.println(crabRangoon.getDescription());
        System.out.println("$" + crabRangoon.getPrice());
        System.out.println(crabRangoon.getCategory());
        System.out.println(crabRangoon.getNewItem());
    }
}

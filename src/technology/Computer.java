package technology;

public class Computer extends AbstractEntity {
    String brand = "Apple";
    String color = "Silver";
    int age = 2;

    Computer() {
        this.brand = brand;
        this.color = color;
        this.age = age;
    }

    public void powerOn() {
        System.out.println("Power is on");
    }

    public void homeScreen() {
        System.out.println("This is the homescreen");
    }

    @Override
    public String getId() {
        return "This is a unique ID!";
    }
}

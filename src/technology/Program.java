package technology;

public class Program {

    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.powerOn();

        Laptop myLaptop = new Laptop();
        System.out.println(myLaptop.brand);
        System.out.println(myLaptop.getId());

        SmartPhone mySmartPhone = new SmartPhone();
        mySmartPhone.homeScreen();
        System.out.println(mySmartPhone.backgroundImage);


    }
}

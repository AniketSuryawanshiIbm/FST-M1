package activities;

public class Car {
    // Variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    // Constructor to initialize tyres and doors
    public Car() {
        this.tyres = 4;
        this.doors = 4;
    }

    // Method to display all car characteristics
    public void displayCharacteristics() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Transmission: " + transmission);
        System.out.println("Car Make: " + make);
        System.out.println("Number of Tyres: " + tyres);
        System.out.println("Number of Doors: " + doors);
    }

    // Method to simulate car acceleration
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }

    // Method to simulate car braking
    public void brake() {
        System.out.println("Car has stopped.");
    }
}

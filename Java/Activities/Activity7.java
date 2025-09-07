package activities;

public class Activity7 {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(10); // starting speed = 10

        myBike.displayDetails();
        myBike.speedUp(15);
        myBike.applyBrake(5);
        myBike.speedUp(40); // will cap at maxSpeed
        myBike.applyBrake(30);
    }
}

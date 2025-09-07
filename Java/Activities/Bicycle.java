package activities;

public class Bicycle implements BicycleParts, BicycleOperations {
    private int speed;

    // Constructor
    public Bicycle(int startSpeed) {
        this.speed = startSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println("Applied brake. Current speed: " + speed);
    }

    @Override
    public void speedUp(int increment) {
        if (speed + increment > maxSpeed) {
            speed = maxSpeed;
        } else {
            speed += increment;
        }
        System.out.println("Sped up. Current speed: " + speed);
    }

    public void displayDetails() {
        System.out.println("Bicycle has " + tyres + " tyres.");
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Current Speed: " + speed);
    }
}

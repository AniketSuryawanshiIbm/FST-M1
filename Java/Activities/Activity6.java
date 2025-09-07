package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(2); // max 2 passengers

        // Onboard passengers
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie"); // should not be allowed

        // Take off
        plane.takeOff();

        // Show passengers
        System.out.println("Passengers onboard: " + plane.getPassengers());

        // Wait for 2 seconds to simulate flight time
        Thread.sleep(2000);

        // Land
        plane.land();

        System.out.println("Last took off at: " + plane.getLastTimeTookOff());
        System.out.println("Last landed at: " + plane.getLastTimeLanded());
    }
}

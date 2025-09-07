package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    // Private fields (Encapsulation)
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    // Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Method to add a passenger
    public boolean onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
            return true;
        } else {
            System.out.println("Cannot add " + passenger + ". Plane is full!");
            return false;
        }
    }

    // Take off
    public void takeOff() {
        lastTimeTookOff = new Date(); // current time
        System.out.println("Plane took off at: " + lastTimeTookOff);
    }

    // Land
    public void land() {
        lastTimeLanded = new Date(); // current time
        System.out.println("Plane landed at: " + lastTimeLanded);
        // Clear passengers after landing
        passengers.clear();
    }

    // Getters
    public List<String> getPassengers() {
        return passengers;
    }

    public Date getLastTimeTookOff() {
        return lastTimeTookOff;
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
}

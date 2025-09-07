package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hs = new HashSet<>();

        // Add 6 objects
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Date");
        hs.add("Fig");
        hs.add("Grapes");

        // Print size of HashSet
        System.out.println("Initial size of HashSet: " + hs.size());

        // Remove an element
        hs.remove("Banana");
        System.out.println("Removed 'Banana'");

        // Try removing an element not present
        boolean removed = hs.remove("Mango");
        System.out.println("Tried removing 'Mango' (not present). Success? " + removed);

        // Check if an element exists
        System.out.println("Does HashSet contain 'Cherry'? " + hs.contains("Cherry"));

        // Print updated set
        System.out.println("Updated HashSet: " + hs);
    }
}

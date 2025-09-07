package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("Diana");
        myList.add("Ethan");

        // Print all names using for loop
        System.out.println("All names in the list:");
        for (String name : myList) {
            System.out.println(name);
        }

        // Get the 3rd name (index starts at 0 → 3rd element is index 2)
        System.out.println("\n3rd name in the list: " + myList.get(2));

        // Check if a name exists
        String checkName = "Charlie";
        System.out.println("\nDoes the list contain \"" + checkName + "\"? " + myList.contains(checkName));

        // Print size of the list
        System.out.println("\nNumber of names in the list: " + myList.size());

        // Remove a name
        myList.remove("Bob");
        System.out.println("\nAfter removing Bob, number of names: " + myList.size());

        // Print updated list
        System.out.println("Updated list:");
        for (String name : myList) {
            System.out.println(name);
        }
    }
}

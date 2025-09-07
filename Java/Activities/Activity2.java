package activities;

public class Activity2 {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {10, 77, 10, 54, -11, 10};

        int sum = 0;

        // Loop through array to find 10's and add them
        for (int num : numbers) {
            if (num == 10) {
                sum += num;
            }
        }

        // Check if sum is exactly 30
        if (sum == 30) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

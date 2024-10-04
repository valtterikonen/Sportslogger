import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportsLogger {
    // Class to represent a sports activity
    static class Activity {
        String name;
        int duration; // in minutes
        LocalDate date;

        public Activity(String name, int duration, LocalDate date) {
            this.name = name;
            this.duration = duration;
            this.date = date;
        }

        @Override
        public String toString() {
            return "Activity: " + name + ", Duration: " + duration + " minutes, Date: " + date;
        }
    }

    // List to store logged activities
    private List<Activity> activities = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Main method to run the application
    public static void main(String[] args) {
        SportsLogger logger = new SportsLogger();
        logger.start();
    }

    // Method to start the application loop
    private void start() {
        while (true) {
            System.out.println("\n--- Sports Logger ---");
            System.out.println("1. Log a new activity");
            System.out.println("2. View logged activities");
            System.out.println("3. Calculate total time for the week");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    logActivity();
                    break;
                case 2:
                    viewActivities();
                    break;
                case 3:
                    calculateTotalTimeForWeek();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    // Method to log a new activity
    private void logActivity() {
        System.out.print("Enter the name of the activity: ");
        String name = scanner.nextLine();
        System.out.print("Enter the duration in minutes: ");
        int duration = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        LocalDate date = LocalDate.now();  // Use current date for simplicity

        Activity activity = new Activity(name, duration, date);
        activities.add(activity);
        System.out.println("Activity logged successfully!");
    }

    // Method to view all logged activities
    private void viewActivities() {
        if (activities.isEmpty()) {
            System.out.println("No activities logged yet.");
        } else {
            System.out.println("\n--- Logged Activities ---");
            for (Activity activity : activities) {
                System.out.println(activity);
            }
        }
    }

    // Method to calculate total time spent on sports for the current week
    private void calculateTotalTimeForWeek() {
        LocalDate startOfWeek = LocalDate.now().with(java.time.DayOfWeek.MONDAY);
        LocalDate endOfWeek = startOfWeek.plusDays(6);

        int totalMinutes = 0;
        for (Activity activity : activities) {
            if (!activity.date.isBefore(startOfWeek) && !activity.date.isAfter(endOfWeek)) {
                totalMinutes += activity.duration;
            }
        }

        System.out.println("Total time spent on sports this week: " + totalMinutes + " minutes.");
    }
}

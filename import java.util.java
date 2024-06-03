import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Enter student grades (type -1 to end):");

        // Input grades
        while (true) {
            double grade = scanner.nextDouble();
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }

        // Check if grades were entered
        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            double average = calculateAverage(grades);
            double highest = findHighest(grades);
            double lowest = findLowest(grades);

            System.out.printf("Average grade: %.2f%n", average);
            System.out.printf("Highest grade: %.2f%n", highest);
            System.out.printf("Lowest grade: %.2f%n", lowest);
        }
    }

    // Method to calculate average grade
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to find highest grade
    public static double findHighest(ArrayList<Double> grades) {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find lowest grade
    public static double findLowest(ArrayList<Double> grades) {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            // Invalid age
            return false;
        } else if (age >= 18) {
            return true; // Eligible to vote
        } else {
            return false; // Not eligible
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10]; // Array for 10 students

        // Taking input
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Checking voting eligibility
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age entered.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is NOT eligible to vote.");
            }
        }

        sc.close();
    }
}

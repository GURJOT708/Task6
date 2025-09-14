import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                System.out.print("Number " + num + " is Positive");
                if (num % 2 == 0) {
                    System.out.println(" and Even.");
                } else {
                    System.out.println(" and Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative.");
            } else {
                System.out.println("Number " + num + " is Zero.");
            }
        }

        // Compare first and last element
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.print("First number (" + first + ") is ");
        if (first == last) {
            System.out.println("equal to last number (" + last + ").");
        } else if (first > last) {
            System.out.println("greater than last number (" + last + ").");
        } else {
            System.out.println("less than last number (" + last + ").");
        }

        sc.close();
    }
}

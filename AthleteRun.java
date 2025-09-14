import java.util.Scanner;

public class AthleteRun {
    
    // Method to compute number of rounds
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km = 5000 meters
        return (int)Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km.");

        sc.close();
    }
}

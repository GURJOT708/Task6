import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        // BMI = weight(kg) / (height(m) * height(m))
        return weight / (height * height);
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[10]; // in meters
        double[] weights = new double[10]; // in kg

        // Input height and weight for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height (in meters): ");
            heights[i] = sc.nextDouble();
            System.out.print("Weight (in kg): ");
            weights[i] = sc.nextDouble();
        }

        // Display BMI and status
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            double bmi = calculateBMI(weights[i], heights[i]);
            String status = determineStatus(bmi);
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", heights[i], weights[i], bmi, status);
        }

        sc.close();
    }
}


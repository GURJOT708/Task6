import java.util.ArrayList;
import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors
    public static int[] findFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        // Convert ArrayList to array
        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
        }
        return factors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        int sum = 0;
        int sumOfSquares = 0;
        long product = 1;

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
            sum += factor;
            sumOfSquares += factor * factor;
            product *= factor;
        }

        System.out.println("\nSum of factors = " + sum);
        System.out.println("Sum of squares of factors = " + sumOfSquares);
        System.out.println("Product of factors = " + product);

        sc.close();
    }
}


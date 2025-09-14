import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method to calculate sum
    public static int recursiveSum(int n) {
        if (n == 0)
            return 0;
        return n + recursiveSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sumRecursive = recursiveSum(n);
        int sumFormula = (n * (n + 1)) / 2;

        System.out.println("Sum using recursion = " + sumRecursive);
        System.out.println("Sum using formula  = " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("✅ Both computations are correct and results match.");
        } else {
            System.out.println("❌ Results do not match.");
        }

        sc.close();
    }
}

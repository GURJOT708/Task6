import java.util.Scanner;

public class NumberCheckerr {

    // Method to find the count of digits
    public static int countDigits(int number) {
        int num = Math.abs(number);
        if (num == 0) return 1;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int n = countDigits(number);
        int[] digits = new int[n];
        int num = Math.abs(number);
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to find the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    // Method to find the frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // column 0 = digit, column 1 = frequency
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        int sumSquares = sumOfSquaresOfDigits(digits);
        boolean harshad = isHarshad(number, digits);
        int[][] frequency = digitFrequency(digits);

        System.out.println("Number of digits: " + digitCount);
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumSquares);
        System.out.println("Is Harshad number? " + harshad);

        System.out.println("Digit Frequency:");
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0)
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
        }

        sc.close();
    }
}

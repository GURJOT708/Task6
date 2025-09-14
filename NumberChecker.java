import java.util.Scanner;

public class NumberChecker {

    // Method to find the count of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int num = Math.abs(number);
        if (num == 0) return 1;
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

    // Method to check if a number is a duck number (has at least one non-zero digit)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        return sum == number;
    }

    // Method to find the largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[] {largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[] {smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("Number of digits: " + digitCount);
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(digits));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit = " + largest[0] + ", Second largest digit = " + largest[1]);

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit = " + smallest[0] + ", Second smallest digit = " + smallest[1]);

        sc.close();
    }
}


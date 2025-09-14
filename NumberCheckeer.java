import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckeer {

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

    // Method to reverse a digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseArray(digits);

        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.print("Reversed digits array: ");
        for (int d : reversedDigits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Are original and reversed arrays equal? " + areArraysEqual(digits, reversedDigits));
        System.out.println("Is the number a palindrome? " + isPalindrome(number));
        System.out.println("Is the number a duck number? " + isDuckNumber(digits));

        sc.close();
    }
}

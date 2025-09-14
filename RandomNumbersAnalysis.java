public class RandomNumbersAnalysis {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;

        // Generate five 4-digit random numbers (1000 to 9999)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000; // random between 1000-9999
            sum += numbers[i];
        }

        // Find min and max
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = sum / 5.0;

        // Display results
        System.out.print("Generated numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage = " + average);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}

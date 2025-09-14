public class FootballTeamHeights {

    // Method to calculate sum of array elements
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double findMean(int[] heights) {
        return findSum(heights) / (double) heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            min = Math.min(min, h);
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            max = Math.max(max, h);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11]; // 11 players
        System.out.print("Player heights (cm): ");

        // Generate random heights between 150 to 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // 150-250
            System.out.print(heights[i] + " ");
        }

        // Calculate results
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        // Display results
        System.out.println("\n\nShortest height = " + shortest + " cm");
        System.out.println("Tallest height = " + tallest + " cm");
        System.out.printf("Mean height = %.2f cm%n", mean);
    }
}

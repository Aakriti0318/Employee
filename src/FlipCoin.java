import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFlips;
        do {
            System.out.print("Enter the number of times to flip the coin (positive integer): ");
            while (!sc.hasNextInt()) {
                System.out.print("That's not a valid number. Enter a positive integer: ");
                sc.next();
            }
            numFlips = sc.nextInt();
        } while (numFlips <= 0);
        int headsCount = 0;
        for (int i = 0; i < numFlips; i++) {
            if (Math.random() < 0.5) {
                headsCount++;
            }
        }

        int tailsCount = numFlips - headsCount;

        // Output: Calculate and display percentages
        double headsPercentage = ((double) headsCount / numFlips) * 100;
        double tailsPercentage = ((double) tailsCount / numFlips) * 100;

        System.out.println("Results:");
        System.out.println("Heads: " + headsCount + " (" + String.format("%.2f", headsPercentage) + "%)");
        System.out.println("Tails: " + tailsCount + " (" + String.format("%.2f", tailsPercentage) + "%)");

        sc.close();
    }
}

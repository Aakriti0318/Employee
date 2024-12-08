import java.util.Random;

public class OnePlayer {
    public static void main(String[]args) {
        // Code for 1 player only
        int Player1= 0;
        final int Winning_Position = 100;
        int diceCount = 0; // Counter to track total dice rolls
        System.out.println("Welcome to the Snake And Ladder Game:");
        Random r = new Random();
        while (Player1 < Winning_Position) {
            diceCount++;
            int dieRoll = r.nextInt(6) + 1;
            System.out.println("Dice Count:" + diceCount +" Dice Roll "+ dieRoll +" Position of Player:"+Player1);
            int option = r.nextInt(3);
            switch (option) {
                case 0 -> System.out.println("Option Selected as :No Play");
                case 1 -> {
                    System.out.println("Option Selected as :Ladder");
                    Player1 += dieRoll;
                }
                case 2 -> {
                    System.out.println("Option Selected as:Snake");
                    Player1 -= dieRoll;
                    if (Player1 < 0) {
                        Player1 = 0;
                    }
                }
                default -> System.out.println("Invalid Option");
            }
            if (Player1 > Winning_Position) {
                Player1 -= dieRoll;
                System.out.println("Roll exceeded winning Position....Remain at:" + Player1);
            }
        }
        System.out.println("Player position: " + Player1);
        System.out.println("*********************************************");
        System.out.println("Congratulations! Player has reached the winning position: " + Winning_Position);
        System.out.println("Total number of dice rolls to win the game: " + diceCount);


     }
}
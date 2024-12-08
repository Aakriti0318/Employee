import java.util.Random;

public class TwoPlayers {
    public static void main(String[] args) {
        // Initialize variables
        int player1Position = 0, player2Position = 0;
        int diceRollCount = 0; // Counter to track total dice rolls
        final int WINNING_POSITION = 100;
        Random random = new Random();

        System.out.println("Starting Snake and Ladder Game with 2 Players!");

        // To track the current player's turn
        int currentPlayer = 1;

        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            // Increment dice roll counter
            diceRollCount++;

            // Roll the die (1 to 6)
            int dieRoll = random.nextInt(6) + 1;
            System.out.println("Player " + currentPlayer + " rolls: " + dieRoll);

            // Check for options: No Play, Ladder, or Snake
            int option = random.nextInt(3); // Random number between 0, 1, and 2
            System.out.print("Option: ");
            int playerPosition = (currentPlayer == 1) ? player1Position : player2Position;

            switch (option) {
                case 0 -> System.out.println("No Play");
                // Player stays in the same position

                case 1 -> {
                    System.out.println("Ladder");
                    //Player position
                    playerPosition += dieRoll;
                    // player should not exceed the winning position
                    if (playerPosition > WINNING_POSITION) {
                        playerPosition -= dieRoll;
                        System.out.println("Roll exceeded winning position. Staying at: " + playerPosition);
                    }
                    // The player gets another turn
                    System.out.println("Player " + currentPlayer + " gets another turn!");
                    if (currentPlayer == 1) {
                        player1Position = playerPosition;
                    } else {
                        player2Position = playerPosition;
                    }
                    continue;
                }
                case 2 -> {
                    System.out.println("Snake");
                    // Player moves behind by the number on the die
                    playerPosition -= dieRoll;
                    if (playerPosition < 0) {
                        playerPosition = 0; // Ensure position doesn't go below 0
                    }
                }

                default -> System.out.println("Invalid option!");
            }

            // Update the player's position
            if (currentPlayer == 1) {
                player1Position = playerPosition;
            } else {
                player2Position = playerPosition;
            }

            // Display the updated player positions
            System.out.println("Player 1 position: " + player1Position);
            System.out.println("Player 2 position: " + player2Position);
            System.out.println("-----------------------");

            // Switch to the next player
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }

        // Determine the winner
        if (player1Position == WINNING_POSITION) {
            System.out.println("Congratulations! Player 1 wins the game!");
        } else {
            System.out.println("Congratulations! Player 2 wins the game!");
        }

        System.out.println("Total number of dice rolls in the game: " + diceRollCount);
    }
}
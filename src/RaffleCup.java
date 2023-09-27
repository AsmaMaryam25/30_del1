import java.util.Scanner;

public class RaffleCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Die die1 = new Die();
        Die die2 = new Die();

        int player1 = 0;
        int player2 = 0;

        while (player1 < 40 && player2 < 40) {
            System.out.println("Player 1:");
            System.out.println("Press enter to roll dice");

            scanner.nextLine();

            die1.rollDie();
            die2.rollDie();

            System.out.println("Sum of rolled dice: " + (die1.getNumber() + die2.getNumber()));

            player1 += die1.getNumber() + die2.getNumber();
            System.out.println("Points: " + player1);

            if (player1 < 40 && player2 < 40) {
                System.out.println();
                System.out.println("------------------------");
                System.out.println();
                System.out.println("Player 2:");
                System.out.println("Press enter to roll dice");

                scanner.nextLine();

                die1.rollDie();
                die2.rollDie();

                System.out.println("Sum of rolled dice: " + (die1.getNumber() + die2.getNumber()));
                player2 += die1.getNumber() + die2.getNumber();
                System.out.println("Points: " + player2);

                System.out.println();
                System.out.println("------------------------");
                System.out.println();
            }
        }

        if (player1 > player2) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
        scanner.close();
    }
}

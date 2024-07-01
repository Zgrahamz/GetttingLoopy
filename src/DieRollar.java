import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void dieRoll() {
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();

        Scanner sca = new Scanner(System.in);

        String playAgain = "";

        int die1 = rand1.nextInt(6 -1 + 1) + 1;
        int die2 = rand2.nextInt(6 - 1 + 1) + 1;
        int die3 = rand3.nextInt(6- 1 + 1) + 1;

        int dieSum = die1 + die2 + die3;
        int throwNum = 0;

        boolean isDone = false;

        do {
            do {
                die1 = rand1.nextInt(6);
                die2 = rand2.nextInt(6);
                die3 = rand3.nextInt(6);

                dieSum = die1 + die2 + die3;

                throwNum += 1;

                System.out.println("Throw " + throwNum + ": ");
                System.out.println(die1 + ", " + die1 + ", " + die1 + ". ");
                System.out.println("The sum of the dice is " + dieSum);

                if(die1 == die2 && die1 == die3) {
                    System.out.println("Play again? [Y/N]");
                    playAgain = sca.nextLine();

                    if(playAgain.equalsIgnoreCase("n")) {
                        isDone = true;
                    }
                }
            } while (!(die1 == die2 && die1 == die3 && die2 == die3));
        } while (!isDone);

    }
}

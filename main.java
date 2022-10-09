
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors!!!");
        System.out.println("\nAre you ready? Write 'yes' if you are.");

        String answer = scan.nextLine();


        if (answer.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("\nChoose: rock or paper or scissors!");
            String player = scan.nextLine();

            String computer = computerChoice();


            String result = result(player, computer);
            printResult(player, computer, result);
        } else {
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }


    public static String computerChoice() {
        double randomChoice = Math.random() * 2;
        randomChoice++;
        int option = (int) randomChoice;
        switch (option) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "wrong value";

        }
    }

    public static String result(String playerChoice, String computerChoice) {
        String result = "";
        if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors"))
                        || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                        || (playerChoice.equals("scissors") && computerChoice.equals("paper"))

        ) {
            result = "You win";
        }

        if (
                (computerChoice.equals("rock") && playerChoice.equals("scissors"))
                        || (computerChoice.equals("paper") && playerChoice.equals("rock"))
                        || (computerChoice.equals("scissors") && playerChoice.equals("paper"))

        ) {
            result = "You lose";
        }
        if (computerChoice.equals(playerChoice)) {
            result = "It's a tie";
        }


        return result;
    }

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose: " + yourChoice);
        System.out.println("\nThe computer chose: " + computerChoice);
        System.out.println("\nResult: " + result);
    }

}

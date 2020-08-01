import java.util.Scanner;

public class RockPapersScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Does player one choose rock paper or scissors? ");
        String playerOne = input.next();
        System.out.print("Does player two choose rock paper or scissors? ");
        String playerTwo = input.next();




        if (playerOne.equals("rock")) {
            if (playerTwo.equals("scissors")) {
                System.out.println("player 1 wins");
            } else if (playerTwo.equals("paper")) {
                System.out.println("player 2 wins");
            } else {
                System.out.println("tie");
            }
        } else if (playerOne.equals("paper")) {
            if (playerTwo.equals("scissors")) {
                System.out.println("player 2 wins");
            } else if (playerTwo.equals("paper")) {
                System.out.println("tie");
            } else { //player2.equals("rock")
                System.out.println("player 1 wins");
            }


        } else { //playerOne.equals("scissors")
            if (playerTwo.equals("scissors")) {
                System.out.println("player 1 wins");
            } else if (playerTwo.equals("paper")) {
                System.out.println("player 2 wins");
            } else {
                System.out.println("tie");
            }
        }

    }
}
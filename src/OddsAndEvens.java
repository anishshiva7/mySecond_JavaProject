import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.println("What is your name? ");
        String name = input.nextLine();

        System.out.println("Hi " + name + ", which do you choose? " +
                " (O)dds or (E)vens?");
        String choice = input.nextLine();

        if ((choice.equalsIgnoreCase("O"))) {
            System.out.println(name + " has picked odds! The computer will be evens.");

        } else if ((choice.equalsIgnoreCase("E"))) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("--------------------------------\n");

        System.out.println("How many “fingers” do you put out? ");
        int fingers = input.nextInt();
        while (fingers > 5 || fingers < 0) {
            System.out.println("Please choose a number of fingers " +
                    "between 0 and 5: ");
            fingers = input.nextInt();

        }
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " fingers.");
        System.out.println("--------------------------------\n");

        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer + " = " + sum);
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven == true) {
            System.out.println(sum + " is ...even!");
            if (choice.equalsIgnoreCase("O")) {
                System.out.println("The computer wins!");
            } else
                System.out.println("That means " + name + " wins! ");
        } else {
                System.out.println(sum + " is ...odd!");
                if (choice.equalsIgnoreCase("E")){
                    System.out.println("The computer wins! :)");                }
                else
                    System.out.println("That means "+ name +" wins! ");
            System.out.println("--------------------------------\n");
        }
    }

}

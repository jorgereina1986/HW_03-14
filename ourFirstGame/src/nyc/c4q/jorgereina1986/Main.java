package nyc.c4q.jorgereina1986;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstq;
        String secondq;

        System.out.println("Your plane crashed and you landed in the jungle. You find a cave near by. Do you want to go in? (Y/N)");
        firstq = input.next();
        if (firstq.equalsIgnoreCase("Y")) {
            System.out.println("You have encountered a cyclops and he killed you! GAME OVER");
        } else if (firstq.equalsIgnoreCase("N")); {
            System.out.println("You continue walking towards the river and find an abandoned boat. Do you want to get in? (Y/N");
            secondq = input.next();

            if (secondq.equalsIgnoreCase("Y")) {
                System.out.println("You get in the boat and then the boat hits some rocks ahead and it sinks with you in it.GAME OVER");
            }


    }

    }
}

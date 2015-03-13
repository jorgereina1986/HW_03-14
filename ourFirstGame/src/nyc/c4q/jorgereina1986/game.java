package nyc.c4q.jorgereina1986;

import java.util.Scanner;
public class game {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstq = "Your plane crashed and you landed in the jungle. You find a cave near by. Do you want to go in? (Y/N)";
        String secondq = "You continue walking towards the river and find an abandoned boat. Do you want to get in? (Y/N)";
        String thirdq = "You get in the boat and then the boat hits some rocks ahead and it sinks with you in it.GAME OVER";
        String fourthq = "You doing the 4 step advance? y or n";
        String fifthq = " you die. ";
        String sixthq;
        String seventhq;
        String eighthq;
        String ninthq;
        String tenthq;
        String eleventhq;
        String twelvethq;
        String thirteenthq;
        String fourteenthq;
        String fifteenthq;
        String gameO = "Game Over";

        String answer;

        System.out.println(firstq);
        answer = input.next();




        while ( answer.equalsIgnoreCase("Y")) {
            System.out.println(thirdq);
            System.out.println(firstq);
            answer = input.next();
        }

        if (answer.equalsIgnoreCase("N")) {
            System.out.println(secondq);
            answer = input.next();
            System.out.println(fourthq);
        }

        /*

        if (firstq.equalsIgnoreCase("Y")) {
            System.out.println(thirdq);
        }

        else if (firstq.equalsIgnoreCase("N")) {
            System.out.println(secondq);
            secondq = input.next();

            if (secondq.equalsIgnoreCase("Y")) {
                System.out.println(thirdq);

            }


        }

        */


    }
}

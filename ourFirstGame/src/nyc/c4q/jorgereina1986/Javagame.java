package nyc.c4q.jorgereina1986;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Jorge Reina on 3/13/15.
 */
public class Javagame {
    public static void main(String[] args) {


        //System Objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //GAme Variables
        String[] enemies = {"Samurai", "Ninja", "Wrestler", "Boxer"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        //Player
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions= 3;
        int healthPotionsHealAmount = 30;
        int healthPotionChance = 50; // percent

        boolean running = true;
        System.out.println("---------------------------------------------------------------");
        System.out.print("****** WELCOME TO THE RING ******\n");

        GAME:
        while (running) {
            System.out.println("---------------------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies [rand.nextInt(enemies.length)];
            System.out.println("\t*** A " + enemy + " wants to challenge you! ***\n");
                //enemy appeared
            while (enemyHealth > 0) {
                System.out.println("\tYour HP! " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink Potion");
                System.out.println("\t3. Run");

                String input = in.nextLine();
                if (input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage!");
                    System.out.println("\t> You received " + damageTaken + " HP Damage!");

                    if(health <1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                        break;
                    }

                }
                else if (input.equals("2")) {
                    if (numHealthPotions > 0) {
                        health += healthPotionsHealAmount;
                        numHealthPotions--;
                        System.out.println("\t> You drank a health potion! Health increased by " + healthPotionsHealAmount + ". "
                                + "\n\t> You now have " + health + " HP"
                                + "\n\t> You have " + numHealthPotions + " health potions left. \n");
                    }
                    else {
                        System.out.println("\t> You have no health potions left. Defeat an enemy for a chance to get one");
                    }

                }
                else if (input.equals("3")) {
                    System.out.println("\tMaybe next time " + enemy + "!");
                    continue GAME;
                }
                else {
                    System.out.println("\tInvalid command");
                }
            }
            if (health < 1) {
                System.out.println("\t> You left the ring, weak from battle.");
                break ;
            }

            System.out.println("---------------------------------------------------------------");
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left. #");
            if (rand.nextInt(100) > healthPotionChance) {
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a health potion! # ");
                System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
            }
            System.out.println("---------------------------------------------------------------");
            System.out.println("What would you like to do?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit Dungeon");

            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command!");
                input = in.nextLine();
            }

            if (input.equals("1")) {
                System.out.println("You continue on your adventure!");
            }
            else if(input.equals("2")) {
                System.out.println("You have left the ring!");
                break;
            }
        }

        System.out.println("######################");
        System.out.println("# THANKS FOR PLAYING #");
        System.out.println("######################");
    }
}

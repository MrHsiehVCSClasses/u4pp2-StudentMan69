package u4pp;

import java.util.Scanner;
import u4pp.*;

public class MonsterFighter {
    public MonsterFighter() {

    }

    public void play(Scanner scanner) {
        System.out.println("Your name is ");
        String userInput = scanner.next();
        Fighter fighter = new Fighter(userInput, 20, 5);
        Monster monster = new Monster("Lizard", 20, 2, 1);
        DefenseMonster defenseMonster = new DefenseMonster("Slime", 20, 2, 1, 6);
        RandomMonster randomMonster = new RandomMonster("NPC", 2, 15, 5);
        Monster[] monsters = { monster, defenseMonster, randomMonster };
        System.out.println(monster);
        System.out.println(fighter);
        while (fighter.getHealth() > 0) {
            for (int i = 0; i < monsters.length; i++) {
                monster = monsters[i];
                while (monster.getHealth() > 0 && fighter.getHealth() > 0) {
                    System.out.println("Do you want to Attack [a] / Block [b]/ Stack [s]?");
                    userInput = scanner.next();
                    if (userInput.equals("a")) {
                        fighter.attack(monster);
                    } else if (userInput.equals("b")) {
                        fighter.block();
                    } else if (userInput.equals("s")) {
                        fighter.focus();
                    } else {
                        System.out.println("Invalid Input");
                        continue;
                    }
                    monster.takeTurn(fighter);
                    System.out.println(monster);
                    System.out.println(fighter);

                }
                if (monster.getHealth() <= 0) {
                    fighter.gainEXP(monster.getExpGiven());
                    System.out.println(monster.getName() + " is killed");
                }
            }
            System.out.println("The end");
            break;
        }

    }

}

/**
 * public MonsterFighter()
 * public void play(Scanner scanner)
 * Gameplay
 * The player should be able to name their Fighter, and then fight a bunch of
 * monsters in succession.
 * The Fighter will gain experience each time they defeat a monster.
 * The Fighter has 3 possible actions each round: attack, focus, and block.
 * Taking any of these actions will end the Fighter's turn.
 * After the Fighter's turn, the current monster will take a turn, targeting the
 * Fighter
 * Monsters should have unique names and statistics.
 * You must include at least 1 normal Monster, 1 RandomMonster, and 1
 * DefenseMonster.
 * Include as much flavor text as you want.
 * Hint: Use InputHelper from u4pp1 & use numbers for options (like when picking
 * what action the Fighter will take)
 * Hint: if you ever find yourself repeating code, see if you can create a
 * helper function. If you want to, you can even split a large function into a
 * collection of smaller ones to divide and conquer
 */

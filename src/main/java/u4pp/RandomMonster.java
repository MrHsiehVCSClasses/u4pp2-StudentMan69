package u4pp;

import u4pp.Combatant;
import java.util.Random;

public class RandomMonster extends Monster {
    private final Random random = new Random();
    // constructor
    public RandomMonster(String name, int health, int attack, int exp) {
        super(name, health, attack, exp);
    }

    // overridden methods
    public void takeTurn(Combatant target) {
          if (random.nextBoolean()) {
            target.takeDamage(this.getAttackPower());
          }
    }

    public String toString(){
        String oldString = super.toString();
        return (oldString + "    This monster has a 50% chance of attacking");
    }

}

/**
 * Constructor
 * public RandomMonster(String name, int health, int attack, int exp)
 * Overridden Methods
 * public void takeTurn(Combatant target) - only has a 50% chance of taking a
 * normal Monster turn. Half the time, does nothing.
 * public String toString() - has everything that Monster's toString does, and
 * also says something that indicates that the monster only has a 50% chance of
 * attacking.
 */
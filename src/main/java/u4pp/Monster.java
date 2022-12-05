package u4pp;

import u4pp.Combatant;

//methods

public class Monster extends Combatant {
    int exp;

    public Monster(String name, int health, int attack, int exp) {
        super(name, health, attack);
        if (exp < 0) {
            exp = 0;
        }
        this.exp = exp;

    }

    public int getExpGiven() {
        return this.exp;
    }

    public void takeTurn(Combatant target) {
        if (canFight()){
            target.takeDamage(this.getAttackPower());
        }
    }

    // overidden methods
    public String toString() {
        String oldString = super.toString();
        return (oldString + " EXP: " + getExpGiven());
    }

}

/**
 * The Monster class should have the following public methods:
 * 
 * Overridden Methods
 * public String toString() - should return everything that the Combatant
 * toString does, plus the amount of experience the Monster gives when it is
 * defeated.
 */
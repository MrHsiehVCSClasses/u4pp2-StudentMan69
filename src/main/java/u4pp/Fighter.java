package u4pp;

import u4pp.Combatant;

public class Fighter extends Combatant {
    int level;
    int xp;
    int stacks;
    boolean isBlocking;

    // Constructor
    public Fighter(String name, int maxHealth, int attack) {
        super(name, maxHealth, attack);
        level = 1;
        xp = 0;
        stacks = 0;
        isBlocking = false;
    }

    // Getters
    public int getEXP() {
        return xp;
    }

    public int getFocusStacks() {
        return stacks;
    }

    public int getLevel() {
        return level;
    }

    public boolean getIsBlocking() {
        return isBlocking;
    }

    // Other methods

    public void attack(Combatant target) {
        int totalDamage = this.attack * (int) Math.pow(2, stacks);
        target.takeDamage(totalDamage);
        stacks = 0;

    }

    public void block() {
        isBlocking = true;

    }

    public void focus() {
        stacks += 1;
    }

    public void gainEXP(int exp) {
        xp += exp;
        while (xp >= level) {
            xp -= level;
            level += 1;
            int newMaxHealth = maxHealth + 5;
            this.setMaxHealth(newMaxHealth);
            int newAttack = attack + 1;
            this.setAttackPower(newAttack);
            this.setHealth(newMaxHealth);
        }
        if (xp < 0) {
            xp = 0;
        }
    }

    // overridden Methods
    public void takeDamage(int damage) {
        if (isBlocking == true) {
            damage = damage / 2;
            isBlocking = false;
        }
        super.takeDamage(damage);
    }

    public String toString() {
        String oldString = super.toString();
        return (oldString + "Your Fighter Level is: " + level + "   " + "Your experience is: " + xp + "   "
                + "Your number of focus stacks are: " + stacks + "   " + "Blocking Status: " + isBlocking);
    }
}

/**
 * 
 * 
 * public String toString() - Should return everything that the Combatant
 * toString does, plus the Fighter's level, experience, number of focus stacks,
 * and a true/false for whether the fighter is blocking.
 */
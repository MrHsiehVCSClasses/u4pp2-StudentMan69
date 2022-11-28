package u4pp;

public class Combatant {
    String name;
    int maxHealth;
    int attack;
    int health;


    public Combatant(String name, int maxHealth, int attack) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.health = maxHealth;

    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getAttackPower() {
        return this.attack;
    }

    // Setters

    public void setHealth(int health) {
        if (health < 0 ) {
            health = 0;
        }
        else if (health > maxHealth){
            health = maxHealth;
        }
        this.health = health;
    }

    public void setMaxHealth(int health) {
        if (health <= 0) {
            health = 1;
        }
        this.maxHealth = health;
        if (this.health > this.maxHealth){
            this.health = maxHealth;
        }
    }

    public void setAttackPower(int attackPower) {
        if (attackPower < 0) {
            attackPower = 0;
        }
        this.attack = attackPower;
    }

    // Other Methods
    public void takeDamage(int damage) {

        if (damage < 0) {
            damage = 0;
        }
        int newHealth = this.health - damage;
        if (newHealth < 0) {
            newHealth = 0;
        }
        this.setHealth (newHealth);
    }

    public boolean canFight() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return ("Your name is: " + name + "   " + "Your attack is: " + attack + "   " + "Your health is: " + health + "Your max Health is: " + maxHealth);
    }



}


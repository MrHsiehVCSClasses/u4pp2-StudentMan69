package u4pp;

import u4pp.Monster;

//Methods
public class DefenseMonster extends Monster {
    int defense;

    public DefenseMonster(String name, int health, int attack, int exp, int defense) {
        super (name, health, attack, exp);
        this.defense = defense;
    }

    public int getDefense(){
        return this.defense;
    }

    //overidden methods
    
    public void takeDamage(int damage){
        int actualDamage =  damage - defense;
        if (actualDamage > 0){
            super.takeDamage(actualDamage);
        }
        

    }

    public String toString(){
        String oldString = super.toString();
        return (oldString + " Defense: " + getDefense());
    }


}

/**
 * public DefenseMonster(String name, int health, int attack, int exp, int
 * defense) - defense is explained in takeDamage below
 * public int getDefense()
 * Overridden Methods
 * public void takeDamage(int damage) - a DefenseMonster negates a certain
 * amount of damage each turn, based on its defense stat. If the damage dealt is
 * less than or equal to its defense, the monster will take no damage. If the
 * damage is greater than the monsters defense, the monster loses health equal
 * to the damage minus its defense.
 * public String toString() - has everything that Monster's toString does, plus
 * the defense of this monster
 */
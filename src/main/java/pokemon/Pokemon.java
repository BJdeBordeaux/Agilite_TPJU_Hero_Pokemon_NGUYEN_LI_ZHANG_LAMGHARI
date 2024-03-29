package pokemon;

import interfaces.SpecialWeapon;
import java.util.ArrayList;
import java.util.List;

public class Pokemon implements SpecialWeapon {
    private String name;
    private int level;
    private List<Attack> attacks;

    public Pokemon() {
        name = "Carapuce";
        level = 1;
        Attack quickAttack = new Attack();
        attacks = new ArrayList<>();
        attacks.add(quickAttack);
    }

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
        attacks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public void addAttack(Attack attack) {
        attacks.add(attack);
    }

    public String levelUp(int x) {
        if (x >= 0) {
            level += x;
            return "Level Up Successful.";
        }
        else {
            return "Cannot Level Down.";
        }
    }

    @Override
    public int getPower() {
        int cpt = 0;
        for (Attack attack : attacks) {
            cpt += attack.getDamage();
        }
        return cpt;
    }
}

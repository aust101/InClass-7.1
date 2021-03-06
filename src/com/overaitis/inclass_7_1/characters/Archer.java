package com.overaitis.inclass_7_1.characters;

public class Archer extends Character {

    public static final int ATTACK_POWER = 15, ATTACK_SPEED=65;

    public Archer(String name, int level) {
        super(name, level);
    }

    @Override
    public void attack() {
        System.out.println("[" + getName() + "] - Your level is " + getLevel() + " and " + getClass().getSimpleName() + "'s attack speed is " + ATTACK_SPEED + " so your speed is now "  + getAttackSpeed());
        System.out.println("[" + getName() + "] - Your level is " + getLevel() + " and " + getClass().getSimpleName()+ "'s attack power is " + ATTACK_POWER + " so your speed is now "  + getAttackPower());
    }

    @Override
    public int getAttackSpeed() {
        return getLevel() * ATTACK_SPEED;
    }

    @Override
    public int getAttackPower() {
        return getLevel() * ATTACK_POWER;
    }
}

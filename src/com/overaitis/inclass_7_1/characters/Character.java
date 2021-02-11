package com.overaitis.inclass_7_1.characters;

import java.util.Objects;

public abstract class Character {
    protected String name;
    protected int level;

    /**
     * Creates a character with the defined name, and a level of the specified level
     * @param name of the character
     * @param level of the character
     */
    public Character(String name, int level) {
        this.name = name;
        this.level = level;
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

    public abstract void attack();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character)) return false;
        Character character = (Character) o;
        return getLevel() == character.getLevel() &&
                Objects.equals(getName(), character.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLevel());
    }

    @Override
    public String toString() {
        return "Character {\n" +
                "\tname=\"" + getName() + "\",\n" +
                "\tlevel=" + getLevel() + "\n" +
                '}';
    }

    public abstract int getAttackSpeed();

    public abstract int getAttackPower();
}

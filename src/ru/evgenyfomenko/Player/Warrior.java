package ru.evgenyfomenko.Player;

import ru.evgenyfomenko.Player.GameClass;

public class Warrior implements GameClass {
    String description = " Это класс воин он имеет много силы но мало брони ";
    String nameClass = "Воин";
    int force;
    int armor;
    int dmage;
    int mana;
    @Override
    public String getDescriptionGC() {
        return description;
    }

    @Override
    public String toString() {
        return nameClass+" "+description;
    }

    @Override
    public void setForce() {
        force +=1;
    }
}

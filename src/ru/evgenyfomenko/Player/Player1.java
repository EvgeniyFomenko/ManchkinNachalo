package ru.evgenyfomenko.Player;

public class Player1 extends Player {
    public Player1(String name, String marker){
        super(name,marker);
        weapon = new weaponSword();
        gameClass = new Warrior();
    }

}

package ru.evgenyfomenko.Weapone;

public class Bow implements Weapon{
    String name;
    int damage = 5;
    public String toString(){
        return name;
    }
    public void Attack(){
        System.out.println("I am shooting in Bow");
    }

}

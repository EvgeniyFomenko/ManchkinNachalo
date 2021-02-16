package ru.evgenyfomenko.Weapone;

public class FireBall implements Weapon{
    String name = "FireBall";
    public String toString(){
        return name;
    }
    public void Attack(){
        System.out.println("I am shoot fireBall");
    }
}

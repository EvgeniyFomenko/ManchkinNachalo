package ru.evgenyfomenko.Weapone;

public class Sword implements Weapon {
    String nSword = "Мечь";
    int damage = 5;
    @Override
    public String toString(){
      return this.nSword + " damage " +this.damage;
    }
    public void Attack(){
        System.out.println("I am Attack  "+ nSword);
    }
}

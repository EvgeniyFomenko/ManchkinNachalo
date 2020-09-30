package ru.evgenyfomenko.Player;

import ru.evgenyfomenko.Player.Weapon;

public class weaponSword implements Weapon {
    String  weapon = "Мечь";
    int damage = 5;
    @Override
    public String toString(){
      return this.weapon+this.damage;
    }
}

package ru.evgenyfomenko.Player;

import ru.evgenyfomenko.Weapone.Weapon;

public class Charter {
    private String name;
    String desctiption;
    public Weapon weapEquip;
    String nameClass;
    int force;
    int armor;
    int damage;
    int mana;
    public Charter (){

    }
    public void SetName(String sName){
        this.name = sName;
    }
    public String GetName() {
        return this.name;
    }
    public void SetWeapon(Weapon sWeap){
        System.out.println("Now I am equip "+sWeap.toString());
        this.weapEquip = sWeap;
    }
    public void Attack(){
        weapEquip.Attack();
    }
    public void GetParameters(String name){
        System.out.println("Parameters "+ name);
        System.out.println("Force "+force);
        System.out.println("Armor "+armor);
        System.out.println("Damage "+damage);
    }
}

package ru.evgenyfomenko.Player;

import ru.evgenyfomenko.Weapone.Weapon;

public class Character {
    private String name;
    String desctiption;
    public Weapon weapEquip;
    String nameClass;
    private int force;
    private int armor;
    private int damage;
    private int mana;
    public Character(){

    }
    public void setName(String sName){
        this.name = sName;
    }
    @Override
    public String toString() {
        return this.name;
    }
    public String getName(){
        return name;
    }
    public void setWeapon(Weapon sWeap){
        System.out.println("Now I am equip "+sWeap.toString());
        this.weapEquip = sWeap;
    }
    public void setArmor(int armor){
        this.armor = armor;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setMana(int mana){
        this.mana = mana;
    }
    public void setForce(int force){
        this.force = force;
    }
    public int getForce(){
        return force;
    }
    public int getMana(){
        return mana;
    }
    public int getArmor(){
        return this.armor;
    }
    public int getDamage(){
        return this.armor;
    }
    public void makeAnAttack(){
        if (weapEquip.equals(null)){
            System.out.println("Weapon not set");
        }else{
            weapEquip.Attack();
        }
    }

    public void getParameters(String name){
        System.out.println("Parameters "+ name);
        System.out.println("Force "+this.force);
        System.out.println("Armor "+this.armor);
        System.out.println("Damage "+this.damage);
    }
}

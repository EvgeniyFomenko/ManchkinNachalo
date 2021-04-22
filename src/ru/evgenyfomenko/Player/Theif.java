package ru.evgenyfomenko.Player;


import ru.evgenyfomenko.Weapone.*;

public class Theif extends Character {
    public Theif(){
        weapEquip = new Bow();
        setName("SmokeAngel");
        desctiption = "Пробирается не слышно как тень";
        nameClass = "Theif";
        setForce(5);
        setArmor(2);
        setDamage(3);
    }


}

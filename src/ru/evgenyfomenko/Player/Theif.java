package ru.evgenyfomenko.Player;


import ru.evgenyfomenko.Weapone.*;

public class Theif extends Charter{
    public Theif(){
        weapEquip = new Bow();
        SetName("SmokeAngel");
        desctiption = "Пробирается не слышно как тень";
        nameClass = "Theif";
        force = 5;
        armor = 2;
        damage = 3;
    }


}

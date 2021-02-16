package ru.evgenyfomenko;

import ru.evgenyfomenko.Player.*;
import ru.evgenyfomenko.Weapone.*;

public class Main    {

    public static void main(String[] args) {
        Charter theif = new Theif();
        theif.GetParameters(theif.GetName());
        theif.GetName();
        theif.Attack();
        theif.SetWeapon(new Sword());
        theif.Attack();

    }
}

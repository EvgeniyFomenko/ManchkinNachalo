package ru.evgenyfomenko.Player;

public class Player {
   private String name;
   private String marker;
   private boolean statsLive;
   GameClass gameClass;
   Weapon weapon;

    public Player(String name, String marker){
        this.name = name;
        setMarker(marker);
        setLive(true);
    }
    public String toString(){
        return this.name;
    }
    void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setLive(boolean Live){
        statsLive = Live;
    }
    public void switchLiveDeadth() {
        if (statsLive == true) {
            statsLive = false;
        } else {
            statsLive = true;
        }
    }
    public boolean getLive(){
        return statsLive;
    }

    public void setMarker(String m){
        marker = m;
    }
    public String performWeapon() {
        return weapon.toString();
    }
    public void performGameClassDescription(){
        this.gameClass.getDescriptionGC();
    }

    public void setGameClass(GameClass gameClass) {
        this.gameClass = gameClass;
    }
    public void setGameWeapon(Weapon weap){
        this.weapon = weap;
    }
    public void setIncreasedForce(){
        this.gameClass.setForce();
    }
}


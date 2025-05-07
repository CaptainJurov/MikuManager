package MikuManager.model.entities;

import MikuManager.model.interfaces.Fightable;

public class Player implements Fightable {
    private float balance;
    private int level;
    private int exp;
    private String name;

    Player () {
    }

    public Player (String name) {
        balance = 100;
        level = 0;
        exp = 0;
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public int getTotalEnegry () {
        return 0;
    }

    @Override
    public int getHealth () {
        return 0;
    }

    @Override
    public void gotHit () {

    }

    @Override
    public int getAttack () {
        return 0;
    }

    @Override
    public String getSpell () {
        return "";
    }
};

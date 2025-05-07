package MikuManager.model.entities;

import MikuManager.model.interfaces.Fightable;

public class NPC implements Fightable {
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
}

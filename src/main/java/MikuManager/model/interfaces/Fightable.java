package MikuManager.model.interfaces;

public interface Fightable {
    int getTotalEnegry();
    int getHealth();
    void gotHit();
    int getAttack();
    String getSpell();
}

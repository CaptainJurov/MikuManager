package MikuManager.Game;

public class Player {
    private float balance;
    private int level;
    private int exp;
    private int wins;
    private int loses;
    Player(float b, int l, int e, int w, int lo) {
        balance = b;
        level = l;
        exp = e;
        wins = w;
        loses = lo;
    }
};

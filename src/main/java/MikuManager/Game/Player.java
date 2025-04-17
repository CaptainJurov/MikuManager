package MikuManager.Game;

public class Player {
    private float balance;
    private int level;
    private int exp;
    private int wins;
    private int loses;
    private String name;

    Player (float b, int l, int e, int w, int lo, String name) {
        balance = b;
        level = l;
        exp = e;
        wins = w;
        loses = lo;
        this.name = name;
    }

    Player (String name) {
        balance = 100;
        level = 0;
        exp = 0;
        wins = 0;
        loses = 0;
        this.name = name;
    }

    public String getName () {
        return name;
    }
};

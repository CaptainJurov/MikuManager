package MikuManager.model.entities;

public class Item {
    private String name;
    private String description;
    private int cost;
    private int count;

    public String getName () {
        return name;
    }

    public int getCost () {
        return cost;
    }

    public int getCount () {
        return count;
    }

    public String getDescription () {
        return description;
    }
}

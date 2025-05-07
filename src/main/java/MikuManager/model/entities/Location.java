package MikuManager.model.entities;

import MikuManager.model.interfaces.MoveEvent;

import java.util.ArrayList;

public class Location {
    final private ArrayList<NPC> enemies;
    final private ArrayList<Item> shop;
    final private ArrayList<MoveEvent> events;

    Location (ArrayList<NPC> enemies, ArrayList<Item> shop, ArrayList<MoveEvent> events) {
        this.enemies = enemies;
        this.shop = shop;
        this.events = events;
    }

    ArrayList<NPC> getEnemies () {
        return enemies;
    }

    ArrayList<Item> getShop () {
        return shop;
    }

    public ArrayList<MoveEvent> getEvents () {
        return events;
    }
}

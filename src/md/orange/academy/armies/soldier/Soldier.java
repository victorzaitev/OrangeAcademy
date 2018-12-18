/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.soldier;

import md.orange.academy.armies.soldier.entity.Race;

/**
 *
 * @author Victor Zaitev
 */
public abstract class Soldier {

    private String name;
    private int health;
    private int categories;
    private short currentProgress;
    private int level;
    private Race race;

    public abstract void attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCategories() {
        return categories;
    }

    public void setCategories(int categories) {
        this.categories = categories;
    }

    public short getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(short currentProgress) {
        this.currentProgress = currentProgress;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

}

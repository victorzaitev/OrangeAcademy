/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.paterns.singleton;

import md.orange.academy.armies.soldier.AllyCommander;
import md.orange.academy.armies.soldier.AllyDragon;
import md.orange.academy.armies.soldier.AllyMage;
import md.orange.academy.armies.soldier.AllySoldier;
import md.orange.academy.armies.soldier.EnemyCommander;
import md.orange.academy.armies.soldier.EnemyDragon;
import md.orange.academy.armies.soldier.EnemySoldier;
import md.orange.academy.armies.soldier.EnemyWitch;

/**
 *
 * @author Victor Zaitev
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public AllyCommander getAllyCommander() {
        return new AllyCommander();
    }

    public AllyDragon getAllyDragon() {
        return new AllyDragon();
    }

    public AllyMage getAllyMage() {
        return new AllyMage();
    }

    public AllySoldier getAllySoldier() {
        return new AllySoldier();
    }

    public EnemyCommander getEnemyCommander() {
        return new EnemyCommander();
    }

    public EnemyDragon getEnemyDragon() {
        return new EnemyDragon();
    }

    public EnemySoldier getEnemySoldier() {
        return new EnemySoldier();
    }

    public EnemyWitch getEnemyWitch() {
        return new EnemyWitch();
    }
}

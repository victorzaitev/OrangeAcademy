/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.paterns.adapter;

import md.orange.academy.armies.soldier.AllyCommander;
import md.orange.academy.armies.soldier.Soldier;

/**
 *
 * @author Victor Zaitev
 */
public class Client {

    private final ISoldier<Soldier> iSoldier;

    public Client(ISoldier<Soldier> iSoldier) {
        this.iSoldier = iSoldier;
    }

    public void attack(Soldier soldier) {
        iSoldier.attack(soldier);
    }
}

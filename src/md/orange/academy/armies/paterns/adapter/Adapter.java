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
public class Adapter implements ISoldier<Soldier> {

    @Override
    public void attack(Soldier soldier) {
        soldier.attack();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.paterns.abstractfactory;

import md.orange.academy.armies.interfaces.segregation.Commander;
import md.orange.academy.armies.interfaces.segregation.Dragon;
import md.orange.academy.armies.interfaces.segregation.Mage;
import md.orange.academy.armies.interfaces.segregation.Witch;
import md.orange.academy.armies.soldier.AllyCommander;
import md.orange.academy.armies.soldier.AllyDragon;
import md.orange.academy.armies.soldier.AllyMage;
import md.orange.academy.armies.soldier.Soldier;

/**
 *
 * @author Victor Zaitev
 */
public class SoldierFactory implements AbstractFactory {

    @Override
    public Commander getCommander() {
        return new AllyCommander();
    }

    @Override
    public Dragon getDragon() {
        return new AllyDragon();
    }

    @Override
    public Mage getMage() {
        return new AllyMage();
    }

    @Override
    public Soldier getSoldier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Witch getWitch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

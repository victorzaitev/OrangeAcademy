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
import md.orange.academy.armies.soldier.Soldier;

/**
 *
 * @author Victor Zaitev
 */
public interface AbstractFactory {

    Commander getCommander();

    Dragon getDragon();

    Mage getMage();

    Soldier getSoldier();

    Witch getWitch();

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.soldier;

import md.orange.academy.armies.interfaces.segregation.Mage;

/**
 *
 * @author Victor Zaitev
 */
public class AllyMage extends Soldier implements Mage {

    @Override
    public void attack() {
        System.out.println("AllyMage acction Attack ");
    }

    @Override
    public void castSpell() {
        System.out.println("AllyMage acction cast spell ");
    }

    @Override
    public void fly() {
        System.out.println("AllyMage acction fly ");
    }

}

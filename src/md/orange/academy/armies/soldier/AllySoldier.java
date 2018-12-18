/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.soldier;

import md.orange.academy.armies.interfaces.segregation.ISoldier;

/**
 *
 * @author Victor Zaitev
 */
public class AllySoldier extends Soldier implements ISoldier {

    @Override
    public void attack() {
        System.out.println("AllySoldier acction Attack ");
    }

    @Override
    public void walk() {
        System.out.println("AllySoldier acction Walk ");
    }

    @Override
    public void protect() {
        System.out.println("AllySoldier acction Protect ");
    }

}

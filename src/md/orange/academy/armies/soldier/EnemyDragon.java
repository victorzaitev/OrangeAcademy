/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.soldier;

import md.orange.academy.armies.interfaces.segregation.Dragon;

/**
 *
 * @author Victor Zaitev
 */
public class EnemyDragon extends Soldier implements Dragon {

    @Override
    public void attack() {
        System.out.println("EnemyDragon acction Attack ");
    }

    @Override
    public void fly() {
        System.out.println("EnemyDragon acction fly ");
    }

}

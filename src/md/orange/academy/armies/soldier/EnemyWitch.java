/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.soldier;

import md.orange.academy.armies.interfaces.segregation.Witch;

/**
 *
 * @author Victor Zaitev
 */
public class EnemyWitch extends Soldier implements Witch {

    @Override
    public void attack() {
        System.out.println("EnemyWitch acction Attack ");
    }

    @Override
    public void curse() {
        System.out.println("EnemyWitch acction curse ");
    }

    @Override
    public void fly() {
        System.out.println("EnemyWitch acction fly ");
    }

}

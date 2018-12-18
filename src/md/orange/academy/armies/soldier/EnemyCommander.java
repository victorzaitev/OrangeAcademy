/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.soldier;

import md.orange.academy.armies.interfaces.segregation.Commander;

/**
 *
 * @author Victor Zaitev
 */
public class EnemyCommander extends Soldier implements Commander {

    @Override
    public void attack() {
        System.out.println("EnemyCommander acction Attack ");
    }

    @Override
    public void promoteSubordinate() {
        System.out.println("EnemyCommander acction promoteSubordinate ");
    }

    @Override
    public void sendOrders() {
        System.out.println("EnemyCommander acction sendOrders ");
    }

}

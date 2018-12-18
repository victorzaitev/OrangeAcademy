/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.soldier;

/**
 *
 * @author Victor Zaitev
 */
public class EnemySoldier extends Soldier implements md.orange.academy.armies.interfaces.segregation.Soldier {

    @Override
    public void attack() {
        System.out.println("EnemySoldier acction Attack ");
    }

    @Override
    public void walk() {
        System.out.println("EnemySoldier acction walk ");
    }

}

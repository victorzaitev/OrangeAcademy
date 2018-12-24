/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.paterns.template;

import md.orange.academy.armies.interfaces.segregation.Commander;
import md.orange.academy.armies.soldier.AllyCommander;
import md.orange.academy.armies.soldier.EnemyCommander;

/**
 *
 * @author Victor Zaitev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Commander commander = new AllyCommander();
        commander.promoteSubordinate();
        commander.sendOrders();
        commander = new EnemyCommander();
        commander.promoteSubordinate();
        commander.sendOrders();
    }

}

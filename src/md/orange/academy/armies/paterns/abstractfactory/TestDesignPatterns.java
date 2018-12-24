/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.paterns.abstractfactory;

import md.orange.academy.armies.soldier.Soldier;

/**
 *
 * @author Victor Zaitev
 */
public class TestDesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SoldierAbstractFactory string = SoldierFactory();
        AbstractFactory abstractFactory = new SoldierFactory();
        abstractFactory.getCommander();
    }
    
}

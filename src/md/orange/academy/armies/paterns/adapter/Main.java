/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.paterns.adapter;

import md.orange.academy.armies.soldier.AllyCommander;
import md.orange.academy.armies.soldier.AllyDragon;

/**
 *
 * @author Victor Zaitev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ISoldier adapter = new Adapter();
        Client client = new Client(adapter);
        AllyDragon allyCommander = new AllyDragon();
        client.attack(allyCommander);
    }

}

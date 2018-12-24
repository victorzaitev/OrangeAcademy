/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.paterns.singleton;

/**
 *
 * @author Victor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();

        threadSafeSingleton.getAllyCommander().attack();
        threadSafeSingleton.getAllyCommander().promoteSubordinate();
        threadSafeSingleton.getAllyCommander().sendOrders();

        threadSafeSingleton.getAllyDragon().attack();

    }

}

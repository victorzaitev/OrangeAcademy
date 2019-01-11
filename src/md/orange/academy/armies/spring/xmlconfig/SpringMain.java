/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.spring.xmlconfig;

import md.orange.academy.armies.interfaces.segregation.Commander;
import md.orange.academy.armies.interfaces.segregation.Dragon;
import md.orange.academy.armies.interfaces.segregation.ISoldier;
import md.orange.academy.armies.interfaces.segregation.Mage;
import md.orange.academy.armies.soldier.AllyCommander;
import md.orange.academy.armies.soldier.EnemyCommander;
import md.orange.academy.armies.soldier.EnemyDragon;
import md.orange.academy.armies.soldier.EnemySoldier;
import md.orange.academy.armies.soldier.EnemyWitch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author victor.zaitev
 */
public class SpringMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Commander allyCommander = (Commander) context.getBean("allyCommander");
        allyCommander.promoteSubordinate();

        Dragon dragon = (Dragon) context.getBean("allyDragon");
        dragon.fly();

        Mage mage = (Mage) context.getBean("allyMage");
        mage.castSpell();

        ISoldier iSoldier = (ISoldier) context.getBean("allySoldier");
        iSoldier.protect();

        EnemyDragon enemyDragon = (EnemyDragon) context.getBean("enemyDragon");
        enemyDragon.attack();

        EnemyWitch enemyWitch = (EnemyWitch) context.getBean("enemyWitch");
        enemyWitch.attack();
    }

}

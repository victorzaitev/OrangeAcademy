/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.spring.javaconfig;

import md.orange.academy.armies.soldier.AllyCommander;
import md.orange.academy.armies.soldier.AllyDragon;
import md.orange.academy.armies.soldier.AllyMage;
import md.orange.academy.armies.soldier.AllySoldier;
import md.orange.academy.armies.soldier.EnemyCommander;
import md.orange.academy.armies.soldier.EnemyDragon;
import md.orange.academy.armies.soldier.EnemySoldier;
import md.orange.academy.armies.soldier.EnemyWitch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author victor.zaitev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(ArmiesConfig.class);

        AllyCommander allyCommander = ctx.getBean(AllyCommander.class);
        allyCommander.attack();

        AllyDragon allyDragon = ctx.getBean(AllyDragon.class);
        allyDragon.attack();

        AllyMage allyMage = ctx.getBean(AllyMage.class);
        allyMage.attack();

        AllySoldier allySoldier = ctx.getBean(AllySoldier.class);
        allySoldier.attack();

        EnemyCommander enemyCommander = ctx.getBean(EnemyCommander.class);
        enemyCommander.attack();

        EnemyDragon enemyDragon = ctx.getBean(EnemyDragon.class);
        enemyDragon.attack();

        EnemySoldier enemySoldier = ctx.getBean(EnemySoldier.class);
        enemySoldier.attack();

        EnemyWitch enemyWitch = ctx.getBean(EnemyWitch.class);
        enemyWitch.attack();
    }

}

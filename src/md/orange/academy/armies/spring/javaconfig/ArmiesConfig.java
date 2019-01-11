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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author victor.zaitev
 */
@Configuration
public class ArmiesConfig {

    @Bean
    public AllyCommander allyCommander() {
        AllyCommander allyCommander = new AllyCommander();
        allyCommander.setName("ally commander name");
        allyCommander.setHealth(1);
        allyCommander.setCategories(2);
        allyCommander.setCurrentProgress((short) 3);
        allyCommander.setLevel(4);
        return allyCommander;
    }

    @Bean
    public AllyDragon allyDragon() {
        AllyDragon soldier = new AllyDragon();
        soldier.setName("name");
        soldier.setHealth(1);
        soldier.setCategories(2);
        soldier.setCurrentProgress((short) 3);
        soldier.setLevel(4);
        return soldier;
    }

    @Bean
    public AllyMage allyMage() {
        AllyMage soldier = new AllyMage();
        soldier.setName("name");
        soldier.setHealth(1);
        soldier.setCategories(2);
        soldier.setCurrentProgress((short) 3);
        soldier.setLevel(4);
        return soldier;
    }

    @Bean
    public AllySoldier allySoldier() {
        AllySoldier soldier = new AllySoldier();
        soldier.setName("name");
        soldier.setHealth(1);
        soldier.setCategories(2);
        soldier.setCurrentProgress((short) 3);
        soldier.setLevel(4);
        return soldier;
    }

    @Bean
    public EnemyCommander enemyCommander() {
        EnemyCommander soldier = new EnemyCommander();
        soldier.setName("name");
        soldier.setHealth(1);
        soldier.setCategories(2);
        soldier.setCurrentProgress((short) 3);
        soldier.setLevel(4);
        return soldier;
    }

    @Bean
    public EnemyDragon enemyDragon() {
        EnemyDragon soldier = new EnemyDragon();
        soldier.setName("name");
        soldier.setHealth(1);
        soldier.setCategories(2);
        soldier.setCurrentProgress((short) 3);
        soldier.setLevel(4);
        return soldier;
    }

    public EnemySoldier enemySoldier() {
        EnemySoldier soldier = new EnemySoldier();
        soldier.setName("name");
        soldier.setHealth(1);
        soldier.setCategories(2);
        soldier.setCurrentProgress((short) 3);
        soldier.setLevel(4);
        return soldier;
    }

    @Bean
    public EnemyWitch enemyWitch() {
        EnemyWitch soldier = new EnemyWitch();
        soldier.setName("name");
        soldier.setHealth(1);
        soldier.setCategories(2);
        soldier.setCurrentProgress((short) 3);
        soldier.setLevel(4);
        return soldier;
    }
}

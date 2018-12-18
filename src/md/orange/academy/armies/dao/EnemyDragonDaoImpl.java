/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.dao;

import md.orange.academy.armies.soldier.EnemyDragon;

/**
 *
 * @author Victor Zaitev
 */
public class EnemyDragonDaoImpl implements GenericDao<EnemyDragon, String> {

    @Override
    public void save(EnemyDragon soldier) {
        System.out.println("save EnemyDragon ");
    }

    @Override
    public EnemyDragon getSoldier(String input) {
        return null;
    }

}

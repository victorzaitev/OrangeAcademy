/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.dao;

import md.orange.academy.armies.soldier.EnemyCommander;

/**
 *
 * @author Victor Zaitev
 */
public class EnemyCommanderDaoImpl implements GenericDao<EnemyCommander, String> {

    @Override
    public void save(EnemyCommander soldier) {
        System.out.println("save EnemyCommander ");
    }

    @Override
    public EnemyCommander getSoldier(String input) {
        return null;
    }

}

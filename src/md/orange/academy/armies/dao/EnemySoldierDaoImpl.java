/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.dao;

import md.orange.academy.armies.soldier.EnemySoldier;

/**
 *
 * @author Victor Zaitev
 */
public class EnemySoldierDaoImpl implements GenericDao<EnemySoldier, String> {

    @Override
    public void save(EnemySoldier soldier) {
        System.out.println("save EnemySoldier ");
    }

    @Override
    public EnemySoldier getSoldier(String input) {
        return null;
    }

}

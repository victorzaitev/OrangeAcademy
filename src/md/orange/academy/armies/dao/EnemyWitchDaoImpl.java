/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.dao;

import md.orange.academy.armies.soldier.EnemyWitch;

/**
 *
 * @author Victor Zaitev
 */
public class EnemyWitchDaoImpl implements GenericDao<EnemyWitch, String> {

    @Override
    public void save(EnemyWitch soldier) {
        System.out.println("save EnemyWitch ");
    }

    @Override
    public EnemyWitch getSoldier(String input) {
        return null;
    }

}
